/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileshw_04;

/**
 *
 * @author Kostaq Papa
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
 

public class FilesHw_04{
    
    public static void main(String[] args) {
        
        Scanner keyboardFileName1 = new Scanner(System.in);
        System.out.println("Enter the name of the first file.txt: ");
        String fileName1 = keyboardFileName1.next();
        
        Scanner keyboardFileName2 = new Scanner(System.in);
        System.out.println("Enter the name of the second file.txt: ");
        String fileName2 = keyboardFileName2.next();
        
        PrintWriter toFile1 = null;
        try{
            toFile1 = new PrintWriter(fileName1);
        }
        catch(FileNotFoundException e){
            System.out.println("PrintWriter error opening the file " + fileName1);
        }        
        String file1ContentStr = "Fghqrag: Xbfgnd Cncn, Uj_59: Svyrf, Qhr Qngr: 9/4/7569";
        toFile1.print(file1ContentStr);
        toFile1.close();
        
        PrintWriter toFile2 = null;
        try{
            toFile2 = new PrintWriter(fileName2);
        }
        catch(FileNotFoundException e){
            System.out.println("PrintWriter error opening the file " + fileName2);
        }
        
        String[] file1ContentStrArray = new String[file1ContentStr.length()];        
        char[] file1ContentCharArray = file1ContentStr.toCharArray();
        
        for(int i=0; i<file1ContentCharArray.length; i++){
            if(Character.isAlphabetic(file1ContentCharArray[i]) && Character.isLowerCase(file1ContentCharArray[i])){
                int file1ContentCharNumeric = (int)file1ContentCharArray[i];
                file1ContentCharNumeric = file1ContentCharNumeric +13;
                if(file1ContentCharNumeric <= 122){
                    file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                    file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                }
                if(file1ContentCharNumeric > 122){
                    if(file1ContentCharNumeric == 123){
                        file1ContentCharNumeric = 97;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 124){
                        file1ContentCharNumeric = 98;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 125){
                        file1ContentCharNumeric = 99;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 126){
                        file1ContentCharNumeric = 100;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 127){
                        file1ContentCharNumeric = 101;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 128){
                        file1ContentCharNumeric = 102;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 129){
                        file1ContentCharNumeric = 103;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 130){
                        file1ContentCharNumeric = 104;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 131){
                        file1ContentCharNumeric = 105;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 132){
                        file1ContentCharNumeric = 106;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 133){
                        file1ContentCharNumeric = 107;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 134){
                        file1ContentCharNumeric = 108;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 135){
                        file1ContentCharNumeric = 109;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                }
            }
            else if(Character.isAlphabetic(file1ContentCharArray[i]) && Character.isUpperCase(file1ContentCharArray[i])){
                int file1ContentCharNumeric = (int)file1ContentCharArray[i];
                file1ContentCharNumeric = file1ContentCharNumeric +13;
                if(file1ContentCharNumeric <= 90){
                    file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                    file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                }
                if(file1ContentCharNumeric > 90){
                    if(file1ContentCharNumeric == 91){
                        file1ContentCharNumeric = 65;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 92){
                        file1ContentCharNumeric = 66;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 93){
                        file1ContentCharNumeric = 67;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 94){
                        file1ContentCharNumeric = 68;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 95){
                        file1ContentCharNumeric = 69;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 96){
                        file1ContentCharNumeric = 70;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 97){
                        file1ContentCharNumeric = 71;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 98){
                        file1ContentCharNumeric = 72;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 99){
                        file1ContentCharNumeric = 73;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 100){
                        file1ContentCharNumeric = 74;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 101){
                        file1ContentCharNumeric = 75;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 102){
                        file1ContentCharNumeric = 76;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                    if(file1ContentCharNumeric == 103){
                        file1ContentCharNumeric = 77;
                        file1ContentCharArray[i] = (char)file1ContentCharNumeric;
                        file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);
                    }
                }
            }
            else if(Character.isDigit(file1ContentCharArray[i])){
                int file1ContentNumeric = Character.getNumericValue(file1ContentCharArray[i]);
                file1ContentNumeric = file1ContentNumeric + 5;
                if(file1ContentNumeric <= 10){
                    file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                }
                if(file1ContentNumeric > 10){
                    if(file1ContentNumeric == 11){
                        file1ContentNumeric = 1;
                        file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                    }
                    if(file1ContentNumeric == 12){
                        file1ContentNumeric = 2;
                        file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                    }
                    if(file1ContentNumeric == 13){
                        file1ContentNumeric = 3;
                        file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                    }
                    if(file1ContentNumeric == 14){
                        file1ContentNumeric = 4;
                        file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                    }
                    if(file1ContentNumeric == 15){
                        file1ContentNumeric = 5;
                        file1ContentStrArray[i] = Integer.toString(file1ContentNumeric);
                    }
                }
            }
            else{//special characters
                file1ContentStrArray[i] = Character.toString(file1ContentCharArray[i]);                
            }
            System.out.print(file1ContentStrArray[i] + " "); //should be written in the 2.txt file
        }
        String file2ContentStr = Arrays.toString(file1ContentStrArray);
        if(file2ContentStr.contains("[")){
            file2ContentStr = file2ContentStr.replace("[", "");
        }
        if(file2ContentStr.contains("]")){
            file2ContentStr = file2ContentStr.replace("]", "");
        }
        if(file2ContentStr.contains(",")){
            file2ContentStr = file2ContentStr.replace(",", "");
        }
        if(file2ContentStr.contains("null")){
            file2ContentStr = file2ContentStr.replace("null", " ");        
        }
        toFile2.print(file2ContentStr);
        toFile2.close();
    }
}
