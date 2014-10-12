/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawingpanel;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kpapa01
 */

public class DrawingPanel extends JPanel{
    
    public void paintComponent(Graphics pen){
        
        //draw outlines of four shapes
        pen.drawRect(50, 50, 20, 20);       // square
        pen.drawRect(100, 50, 40, 20);      // rectangle
        pen.drawOval(200, 50, 20, 20);      // circle
        pen.drawOval(250, 50, 40, 20);      // oval
        
        //draw text
        pen.drawString("Square", 50, 90);
        pen.drawString("Rectangle", 100, 90);
        pen.drawString("Circle", 200, 90);
        pen.drawString("Oval", 250, 90);
        
        //paint areas of four shapes
        pen.fillRect(50, 100, 20, 20);      // square
        pen.fillRect(100, 100, 40, 20);     // rectangle
        pen.fillOval(200, 100, 20, 20);     // circle
        pen.fillOval(250, 100, 40, 20);     //oval
        
        //draw a line
        pen.drawLine(50, 150, 300, 150);    //line
        
        //draw an arc; paint its area
        pen.drawArc(50, 150, 250, 100, 0, 180); //arc
        pen.fillArc(100, 175, 200, 75, 90, 45); //arc
    }
        
        public static void main(String[] args){
            
            JFrame aWindow = new JFrame();
            aWindow.setSize(350, 300);                                  // width*high
            aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aWindow.setTitle("Sample of Shapes");                       // window's title
            DrawingPanel panel = new DrawingPanel();
            aWindow.add(panel);
            aWindow.setVisible(true);
        }
}
