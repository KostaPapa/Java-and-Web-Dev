/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadssimple;

/**
 *
 * @author kpapa01
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ThreadsSimple {

   static void threadMessage(String message){
       String threadName = Thread.currentThread().getName();
       System.out.format("%s: %s%n",threadName,message);
   }
   private static class MessageLoop implements Runnable{
       public void run(){
           String impInfo[] = {"Mares eat oats", "Lambs eat ivy", "Kids eat ivy too"};
           try{
               for(int i=0; i<impInfo.length;i++){
                   Thread.sleep(4000);
                   threadMessage(impInfo[i]);
               }
           }catch(InterruptedException e){
               threadMessage("I wasnt done");
           }
       }
   }
    public static void main(String[] args) throws InterruptedException {
        long patience = 1000 * 60 * 60;
        if(args.length>0){
            try{
                patience = Long.parseLong(args[0])*1000;
            }catch(NumberFormatException e){
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }
        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();
        
    }
    
}
