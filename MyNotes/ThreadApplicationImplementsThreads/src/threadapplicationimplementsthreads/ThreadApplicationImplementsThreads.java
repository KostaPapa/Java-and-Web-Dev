/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadapplicationimplementsthreads;

/**
 *
 * @author kpapa01
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ThreadApplicationImplementsThreads extends Thread {

    public void run(){
        System.out.println("Hello from a thread");
    }
    
    public static void main(String[] args) {
        new ThreadApplicationImplementsThreads().start();
    }
    
}
