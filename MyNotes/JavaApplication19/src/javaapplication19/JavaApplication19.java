/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication19;

/**
 *
 * @author Kostaq Papa
 */

import java.util.*;

public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> lArr1 = new ArrayList<Integer>() {{ add(0); add(2); add(5); add(3);}}; //Creating the first ArrayList;
        List<Integer> lArr2 = new ArrayList<Integer>() {{ add(1); add(2); add(7); add(4); add(9); add(5);}}; //Creating the second ArrayList;
        List<Integer> lArrDublicates = new ArrayList<Integer>(); //Creating an ArrayList that will hold the dublicate items of lArr1;
        
        int index1=0; 
        
        for(int i=0; i<lArr1.size(); i++){
            for(int j=0; j<lArr2.size(); j++){
                if(lArr1.get(i) == lArr2.get(j)){       //Checking if there are dublicate items
                    index1 = i;     //Storing the index of the dublicated item
                    lArrDublicates.add(lArr1.get(index1));      //Inserting the item into lArrDublicates
                    lArr1.remove(index1);       //Removing the dublicate items from lArr1, hence what remains will be the unique values
                }
            }
        }         
        System.out.println("The dublicate items of Array1: "+lArrDublicates);
        System.out.println("The unique items of Array1: "+lArr1);
    }
}
