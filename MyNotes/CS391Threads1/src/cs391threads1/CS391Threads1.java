/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs391threads1;

/**
 *
 * @author kpapa01
 */
public class CS391Threads1 {

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
    Console(int newid){
        id = newid;
        sema = new Object();
    }
    public void run(){
        for(int i=0; i<100;i++){
            System.out.println(id);
            try{
                sleep(1);
            }
            catch (InterruptedException e){};
        }
    }
}