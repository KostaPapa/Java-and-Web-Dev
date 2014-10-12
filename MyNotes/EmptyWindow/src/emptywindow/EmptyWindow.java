/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emptywindow;
/**
 *
 * @author kpapa01
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

public class EmptyWindow {
    
    public static void main(String[] args) {
        
        JFrame aWindow = new JFrame();      //new and empty invisible frame
        aWindow.setSize(300,200);           //width and high in pixels
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setTitle("My Empty Window");//title of the window
        aWindow.setVisible(true);           //makes htr window visible        
        
    }    
}