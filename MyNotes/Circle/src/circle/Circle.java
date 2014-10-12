/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle;

/**
 *
 * @author kpapa01
 */

import java.util.*;

public class Circle {

    /**
     * @param args the command line arguments
     */
    double radius = 1.0;
    Circle(){}
    
    Circle(double newRadius){
        radius = newRadius;
    }
    
    double getArea(){
        return radius*radius*Math.PI;
    }
    public static void main(String[] args){}
}