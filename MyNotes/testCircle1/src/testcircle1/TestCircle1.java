/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcircle1;

/**
 *
 * @author kpapa01
 */
public class TestCircle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        Circle1 circle2 = new Circle1(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
       
    }
    
}

class Circle1{
    double radius;
    
    Circle1(){radius = 1.0;}
    Circle1(double newRadius){radius=newRadius;}
    
    double getArea(){
        return radius*radius*Math.PI;
    }
}