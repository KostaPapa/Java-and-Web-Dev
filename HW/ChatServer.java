/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author Kostaq Papa
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ChatServer implements Runnable
{  
   private ServerSocket     server = null;
   private Thread           thread = null;
   private ChatServerThread[] clients = new ChatServerThread[50];
   private DataInputStream  streamIn  =  null;
   private int clientCount = 0;
   
   public ChatServer()
   {   
      try
      {
        server = new ServerSocket(5190); 
        System.out.println("Server started: " + server);
        start();
      }
      catch(IOException ioe)
      {
          System.out.println(ioe);
      }
   }
   
   public void run()
   {  
      while (thread != null)
      { 
         try
         { 
            System.out.println("Waiting for a client ...");
            addThread(server.accept());
         }
         catch(IOException ie)
         {  
             System.out.println("Acceptance Error: " + ie); 
         }
      }
   }
  
   private int findClient(String name)
   {  
       for (int i = 0; i < clientCount; i++)
         if (clients[i].getClientName() == name)
            return i;
      return -1;
   }
   
   public synchronized void handle(String name, String input)
   { 
      if (input.equals("QUIT"))
      {  
          clients[findClient(name)].send("QUIT");
         remove(name); 
      }
      else
         for (int i = 0; i < clientCount; i++)
            clients[i].send(name + ": " + input);   
   }
   
   public synchronized void remove(String name)
   {  
      int pos = findClient(name);
      if (pos >= 0)
      { 
         ChatServerThread toTerminate = clients[pos];
         System.out.println("Removing client thread " + name + " at " + pos);
         if (pos < clientCount-1)
            for (int i = pos+1; i < clientCount; i++)
               clients[i-1] = clients[i];
         clientCount--;
         try
         { 
             toTerminate.close(); 
         }
         catch(IOException ioe)
         {
             System.out.println("Error closing thread: " + ioe); 
         }
         toTerminate.stop(); 
      }
   }
   
   private void addThread(Socket socket)
   {  
       if (clientCount < clients.length)
      {  
         System.out.println("Client accepted: " + socket);
         clients[clientCount] = new ChatServerThread(this, socket);
         
         try
         {  clients[clientCount].open(); 
            clients[clientCount].start();  
            clientCount++; }
         catch(IOException ioe)
         {  System.out.println("Error opening thread: " + ioe); } }
      else
         System.out.println("Client refused: maximum " + clients.length + " reached.");
   }

   public void start()
   {  
      if (thread == null)
      {  thread = new Thread(this); 
         thread.start();
      }
   }
   public void stop()
   {  
      if (thread != null)
      {  thread.stop(); 
         thread = null;
      }
   }
   
   public static void main(String args[])
   {  
      ChatServer server = null;
      server = new ChatServer();
   }
}

class ChatServerThread extends Thread
{  
   private Socket          socket   = null;
   private ChatServer      server   = null;
   private DataInputStream streamIn =  null;
   private DataOutputStream streamOut = null;
   private String           clientName = null;
   
   public ChatServerThread(ChatServer newServer, Socket newSocket)
   {
      super();
      server = newServer;  socket = newSocket;
      try
      {
        clientName = new DataInputStream(new 
                        BufferedInputStream(socket.getInputStream())).readUTF();
      }
      catch(IOException ioe)
      {
        
      }
      System.out.println("Server Thread " + clientName + " running.");
   }
   
   public String getClientName()
   {
       return clientName;
   }
   
   public void send(String msg)
   {
       try
       {  
          streamOut.writeUTF(msg);
          streamOut.flush();
       }
       catch(IOException ioe)
       {  
          System.out.println(clientName + " ERROR sending: " + ioe.getMessage());
          server.remove(clientName);
          stop();
       }
   }

   public void run()
   {  
      while (true)
      {  
         try
         {  
            server.handle(clientName, streamIn.readUTF());
         }
         catch(IOException ioe)
         {
            System.out.println(clientName + " ERROR reading: " + ioe.getMessage());
            server.remove(clientName);
            stop();
         }
      }
   }
   
   public void open() throws IOException
   {
      streamIn = new DataInputStream(new 
                        BufferedInputStream(socket.getInputStream()));
      streamOut = new DataOutputStream(new
                        BufferedOutputStream(socket.getOutputStream()));
   }
   
   public void close() throws IOException
   {  
      if (socket != null)    socket.close();
      if (streamIn != null)  streamIn.close();
      if (streamOut != null) streamOut.close();
   }
}