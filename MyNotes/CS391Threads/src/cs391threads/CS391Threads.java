/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs391threads;

/**
 *
 * @author dkatz
 */
public class CS391Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread[] ta = new Thread[4];
        for(int i=0; i<4; i++){
            ta[i] = new Console(i);
            ta[i].start();
        }
    }
}

class Console extends Thread{
    static Object sema;
    int id;
    Console(int newid){id=newid; sema=new Object();}
    public void run(){
        for (int i=0; i<100; i++){
            //synchronized(sema){ //sema.wait();
                printLine(id);
            //} //sema.notify();
                try{sleep(1);}catch(InterruptedException e){}
        }
    }
    public static synchronized void printLine(int sid){
        for (int j=0; j<sid; j++)
            System.out.print('\t');
        System.out.println(sid+".");
    }
}