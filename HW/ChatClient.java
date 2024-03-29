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
import java.applet.*;
import java.awt.*;
import java.util.Scanner;

public class ChatClient extends Applet
{  
   private Socket          socket    = null;
   private DataInputStream  console   = null;
   private DataOutputStream streamOut = null;
   private ChatClientThread client    = null;
   private TextArea display = new TextArea();
   private TextField input   = new TextField();
   private Button    
           send    = new Button("Send"),
           connect = new Button("Connect"),
           quit    = new Button("Quit");
   private int serverPort = 5190;
   private String serverName = null;
   
   public void init()
   {  
      setSize(500,500); 
      Panel keys = new Panel(); 
      keys.setLayout(new GridLayout(1,2));
      keys.add(quit); keys.add(connect);
      Panel south = new Panel(); 
      south.setLayout(new BorderLayout());
      south.add("West", keys); 
      south.add("Center", input);  
      south.add("East", send);
      Label title = new Label("Simple Chat Client Applet", Label.CENTER);
      title.setFont(new Font("Helvetica", Font.BOLD, 14));
      setLayout(new BorderLayout());
      add("North", title); 
      add("Center", display);  
      add("South",  south);
      quit.disable(); send.disable();
      try
      {
        InetAddress addr = InetAddress.getLocalHost();
        serverName = addr.getHostName();
      }
      catch(UnknownHostException uhe)
      {  
        println("Host unknown: " + uhe.getMessage());
      }
   }
      
   public boolean action(Event e, Object o)
   {  
      if (e.target == quit)
      {  
         input.setText("QUIT");
         send();  
         quit.disable(); 
         send.disable(); 
         connect.enable(); }
      else if (e.target == connect)
      {  
          connect(serverName);
      }
      else if (e.target == send)
      {
          send(); 
          input.requestFocus();
      }
      return true; 
   }
   
   public void connect(String serverName)
   {  
      println("Establishing connection. Please wait ...");
      try
      {  
        socket = new Socket(serverName, 5190);
        println("Connected: " + socket);
        println("Please enter your username: "); 
        open(); 
        send.enable(); 
        connect.disable(); 
        quit.enable(); 
      }
      catch(UnknownHostException uhe)
      {  
          println("Host unknown: " + uhe.getMessage());
      }
      catch(IOException ioe)
      {
          println("Unexpected exception: " + ioe.getMessage());
      } 
   }
 
   private void send()
   { 
      try
      {  
          streamOut.writeUTF(input.getText()); 
          streamOut.flush(); 
          input.setText(""); 
      }
      catch(IOException ioe)
      { 
          println("Sending error: " + ioe.getMessage()); 
          close();
      } 
   }
   
   public void open()
   {
      try
      {  
         streamOut = new DataOutputStream(socket.getOutputStream());
         client = new ChatClientThread(this, socket);
      }
      catch(IOException ioe)
      { 
          println("Error opening output stream: " + ioe); 
      } 
   }
   
   public void close()
   { 
      try
      {  
         if (streamOut != null)  streamOut.close();
         if (socket    != null)  socket.close(); 
      }
      catch(IOException ioe)
      {
          println("Error closing ...");
      }
      client.close(); 
      client.stop(); }
      
   private void println(String msg)
   { 
       display.appendText(msg + "\n");
   }
   
   public void handle(String msg)
   {  
      if (msg.equals("QUIT"))
      { 
         println("Good bye. Press RETURN to exit ...");
         stop();
      }
      else
         println(msg);
   }
}

class ChatClientThread extends Thread
{  
   private Socket           socket   = null;
   private ChatClient       client   = null;
   private DataInputStream  streamIn = null;
   
   public ChatClientThread(ChatClient newClient, Socket newSocket)
   {  
      client   = newClient;
      socket   = newSocket;
      open();  
      start();
   }
  
   public void open()
   {  
      try
      {  
         streamIn  = new DataInputStream(socket.getInputStream());
      }
      catch(IOException ioe)
      {  
         System.out.println("Error getting input stream: " + ioe);
         client.stop();
      }
   }
   
   public void close()
   {  
      try
      {  
          if (streamIn != null) streamIn.close();
      }
      catch(IOException ioe)
      { 
          System.out.println("Error closing input stream: " + ioe);
      }
   }
   
   public void run()
   {  
       while (true)
      {  
          try
         {
             client.handle(streamIn.readUTF());
         }
         catch(IOException ioe)
         { 
             System.out.println("Listening error: " + ioe.getMessage());
            client.stop();
         }
      }
   }
}
