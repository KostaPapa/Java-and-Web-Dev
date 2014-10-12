/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs391window1;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author kpapa01
 */
public class CS391Window1 {

    static int i;
    static JLabel jl;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int x = JOptionPane.showConfirmDialog(null, "Wanna title");
        int x=1;
        if(x<2){
            String result;
            if(x<1){
                result = JOptionPane.showInputDialog(null, "Title?");
            }
            else{
                result = "Boring title";
            }
            JFrame jf = new JFrame(result);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //JOptionPane.showMessageDialog(null, "Dont Press OK!!!", "Useless Message", JOptionPane.QUESTION_MESSAGE);
            jf.setSize(420, 400);
            JPanel jp = new JPanel();
            Random r = new Random();
            int rcol = r.nextInt(256);
            int gcol = r.nextInt(256);
            int bcol = r.nextInt(256);
            //System.out.println("R:"+rcol+"\nG:"+gcol+"\nB:"+bcol);
            Color c = new Color(rcol,gcol,bcol);
            jp.setBackground(c);
            i=0;
            ActionListener al = new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    i++;
                    jl.setText("I="+i);
                }
            };
            JButton sjb = new JButton("SOUTH_BUTTON");
            sjb.addActionListener(al);
            jp.setLayout(new BorderLayout());
            jl = new JLabel("I=0");
            jl.setHorizontalAlignment(SwingConstants.CENTER);
            jp.add(jl, BorderLayout.NORTH);
            jp.add(sjb, BorderLayout.SOUTH);
            jf.add(jp);           
            jf.setVisible(true);
        }
    }
    
}

















