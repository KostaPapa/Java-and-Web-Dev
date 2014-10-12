/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadsleepmessages;

/**
 *
 * @author kpapa01
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ThreadSleepMessages {
    
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {"Mares eat oats", "Lambs eat ivy", "Kids eat ivy too"};
        for(int i=0; i<importantInfo.length; i++){
            Thread.sleep(4000);
            System.out.println(importantInfo[i]);
        }
    }
}
        
