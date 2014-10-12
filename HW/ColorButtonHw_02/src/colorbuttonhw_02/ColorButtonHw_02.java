package colorbuttonhw_02;

/**
 *
 * @author Kostaq Papa
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ColorButtonHw_02{

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
        
        ActionListener al1 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b1Col = cGen.nextInt(256);
                Color colorB1 = new Color(b1Col);
                button1.setBackground(colorB1);
            }
        };
        ActionListener al2 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b2Col = cGen.nextInt(256);
                Color colorB2 = new Color(b2Col);
                button2.setBackground(colorB2);
            }
        };
        ActionListener al3 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b3Col = cGen.nextInt(256);
                Color colorB3 = new Color(b3Col);
                button3.setBackground(colorB3);
            }
        };
        ActionListener al4 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b4Col = cGen.nextInt(256);
                Color colorB4 = new Color(b4Col);
                button4.setBackground(colorB4);
            }
        };
        ActionListener al5 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b5Col = cGen.nextInt(256);
                Color colorB5 = new Color(b5Col);
                button5.setBackground(colorB5);
            }
        };
        ActionListener al6 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b6Col = cGen.nextInt(256);
                Color colorB6 = new Color(b6Col);
                button6.setBackground(colorB6);
            }
        };
        ActionListener al7 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b7Col = cGen.nextInt(256);
                Color colorB7 = new Color(b7Col);
                button7.setBackground(colorB7);
            }
        };
        ActionListener al8 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random cGen = new Random();
                int b8Col = cGen.nextInt(256);
                Color colorB8 = new Color(b8Col);
                button8.setBackground(colorB8);
            }
        };
        button1.addActionListener(al2);
        button1.addActionListener(al3);
        button1.addActionListener(al4);
        button1.addActionListener(al5);
        button1.addActionListener(al6);
        button1.addActionListener(al7);
        button1.addActionListener(al8);
        
        button2.addActionListener(al1);
        button2.addActionListener(al3);
        button2.addActionListener(al4);
        button2.addActionListener(al5);
        button2.addActionListener(al6);
        button2.addActionListener(al7);
        button2.addActionListener(al8);
        
        button3.addActionListener(al1);
        button3.addActionListener(al2);
        button3.addActionListener(al4);
        button3.addActionListener(al5);
        button3.addActionListener(al6);
        button3.addActionListener(al7);
        button3.addActionListener(al8);
        
        button4.addActionListener(al1);
        button4.addActionListener(al2);
        button4.addActionListener(al3);
        button4.addActionListener(al5);
        button4.addActionListener(al6);
        button4.addActionListener(al7);
        button4.addActionListener(al8);
        
        button5.addActionListener(al1);
        button5.addActionListener(al2);
        button5.addActionListener(al3);
        button5.addActionListener(al4);
        button5.addActionListener(al6);
        button5.addActionListener(al7);
        button5.addActionListener(al8);
        
        button6.addActionListener(al1);
        button6.addActionListener(al2);
        button6.addActionListener(al3);
        button6.addActionListener(al4);
        button6.addActionListener(al5);
        button6.addActionListener(al7);
        button6.addActionListener(al8);
        
        button7.addActionListener(al1);
        button7.addActionListener(al2);
        button7.addActionListener(al3);
        button7.addActionListener(al4);
        button7.addActionListener(al5);
        button7.addActionListener(al6);
        button7.addActionListener(al8);
        
        button8.addActionListener(al1);
        button8.addActionListener(al2);
        button8.addActionListener(al3);
        button8.addActionListener(al4);
        button8.addActionListener(al5);
        button8.addActionListener(al6);
        button8.addActionListener(al7);
        
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
        aWindow.setTitle("Color Buttons HW_02");
        aWindow.setVisible(true);
        
    }
}
        
        