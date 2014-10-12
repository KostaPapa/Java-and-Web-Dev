package colorbuttonthreadshw_03;

/**
 *
 * @author Kostaq Papa
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ColorButtonThreadsHw_03 extends Thread{

    public static void main(String[] args){
        
        JFrame aWindow = new JFrame();
        
        final JButton button1 = new JButton();
        final JButton button2 = new JButton();
        final JButton button3 = new JButton();
        final JButton button4 = new JButton();
        final JButton button5 = new JButton();
        final JButton button6 = new JButton();
        final JButton button7 = new JButton();
        final JButton button8 = new JButton();
       
        button1.setBounds(0, 0, 250, 125);
        button2.setBounds(0, 125, 250, 125);
        button3.setBounds(0, 250, 250, 125);
        button4.setBounds(0, 375, 250, 125);
        button5.setBounds(250, 0, 525, 125);
        button6.setBounds(250, 125, 525, 125);
        button7.setBounds(250, 250, 525, 125);
        button8.setBounds(250, 375, 525, 125);
        
        aWindow.setLayout(null);
        
        aWindow.add(button1);
        aWindow.add(button2);
        aWindow.add(button3);
        aWindow.add(button4);
        aWindow.add(button5);
        aWindow.add(button6);
        aWindow.add(button7);
        aWindow.add(button8);
        
        aWindow.setBounds(525, 525, 525, 525);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setTitle("Color Thread Buttons HW_03");
        aWindow.setVisible(true);
        
        Thread sleepyThread = new Thread();
        //Thread lazyThread = new Thread();
        
        for(int i=0; i<10; i++){
            try{
                sleepyThread.sleep(5000);
            }catch(InterruptedException ie){}
            
            Random cGen = new Random();
            float k_B1Col = cGen.nextFloat();
            float a_B1Col = cGen.nextFloat();
            float t_B1Col = cGen.nextFloat();
            float z_B1Col = cGen.nextFloat();
    
            Color colorB1 = new Color(k_B1Col,a_B1Col,t_B1Col,z_B1Col );
            Color colorB2 = new Color(a_B1Col, t_B1Col, z_B1Col, k_B1Col);
            Color colorB3 = new Color(t_B1Col, z_B1Col, k_B1Col, a_B1Col);
            Color colorB4 = new Color(z_B1Col, k_B1Col, a_B1Col, t_B1Col);
            Color colorB5 = new Color(t_B1Col, a_B1Col, k_B1Col, z_B1Col);
            Color colorB6 = new Color(t_B1Col, z_B1Col, a_B1Col, z_B1Col);
            Color colorB7 = new Color(a_B1Col, t_B1Col, z_B1Col, k_B1Col);
            Color colorB8 = new Color(k_B1Col, z_B1Col, a_B1Col, t_B1Col);
            
            if(button1.isSelected() || button2.isSelected() || button3.isSelected() || button4.isSelected() || button5.isSelected() || button6.isSelected() || button7.isSelected() || button8.isSelected()){
                sleepyThread.interrupt();
                for(int j=0; j<5; j++){
                    try{
                        sleepyThread.sleep(5000);
                    }catch(InterruptedException ie){}
                    button1.setBackground(colorB1);
                    button2.setBackground(colorB2);
                    button3.setBackground(colorB3);
                    button4.setBackground(colorB4);
                    button5.setBackground(colorB5);
                    button6.setBackground(colorB6);
                    button7.setBackground(colorB7);
                    button8.setBackground(colorB8);
                }
            }
            else{
                button1.setBackground(colorB1);
                button2.setBackground(colorB2);
                button3.setBackground(colorB3);
                button4.setBackground(colorB4);
                button5.setBackground(colorB5);
                button6.setBackground(colorB6);
                button7.setBackground(colorB7);
                button8.setBackground(colorB8);
            }
        }
    }
}
            //else{
              //  button1.setBackground(colorB1);
            //}
            
                  //  sleepyThread.interrupt();
                    //for(int j=0; j<20; j++){
                      //  try{
                        //    lazyThread.sleep(1000);
                        //}catch(InterruptedException ie){}
                        //button1.setBackground(colorB1);
                    //}
                //}
            //}
            //else
            //}
            
            
            //button2.setBackground(colorB2);

        //aWindow.add(button2);
        //aWindow.add(button3);
        //aWindow.add(button4);
        //aWindow.add(button5);
        //aWindow.add(button6);
        //aWindow.add(button7);
        //aWindow.add(button8);    
        
    

        
        