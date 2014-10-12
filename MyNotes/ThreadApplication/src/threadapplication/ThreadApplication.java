/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadapplication;

/**
 *
 * @author kpapa01
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ThreadApplication implements Runnable{
    
    public void run(){
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new ThreadApplication())).start();
    }
    
}
