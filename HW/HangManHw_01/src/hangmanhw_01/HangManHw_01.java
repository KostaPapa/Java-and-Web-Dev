/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangmanhw_01;

/**
 *
 * @author Kostaq Papa
 * @school ID 0412768
 */

import java.util.Random;
import java.util.Scanner;
//import java.util.Vector;
//import java.util.Arrays;

public class HangManHw_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int MAX_NO_GUESS = 6;        
        String[] words = {"up","out","about","take","know","people","into","some","now","come",
                            "over","think","also","back","after","love","hate","sex","down","sexy",
                            "hot", "cold", "yes","no","wrong","right"};
        Random generator = new Random();
        int wordIndex = generator.nextInt(words.length); //randomly pickes a word from the words vector
     
        System.out.println("Wellcome to HANGMAN!");
        
        char[] guessedWord = new char[words[wordIndex].length()]; //creates an empty vector that will be filled by the user
        for (int i=0; i<words[wordIndex].length(); i++){
            guessedWord[i]='_';
            System.out.print(guessedWord[i]);
            System.out.print(" ");
        }
        
        String wordStr = new String(words[wordIndex]); //variable 'wordStr' holds the random word
        int guessItIndex; //will hold the index of the guessed character from the user
                
        Scanner keyboard = new Scanner(System.in);
        
        while(MAX_NO_GUESS != 0){
            System.out.print(" Guesses left: " + MAX_NO_GUESS);
            System.out.print(" Which Letter? ");
            String guessIt = keyboard.next();
                
            if(wordStr.contains(guessIt)){
                System.out.println("You got a letter correct!");
                
                char guessItChar = guessIt.charAt(0); //converts the guessed word from string to char
                guessItIndex = wordStr.indexOf(guessIt); //gets the index of guessed word from the random word
                guessedWord[guessItIndex] = guessItChar; //fills in the 'guessedword' vector with the character
                
                for(int j=0;j<words[wordIndex].length();j++){
                    System.out.print(guessedWord[j]);
                    System.out.print(" ");
                }
                String guessedWordStr = String.valueOf(guessedWord); //converts the 'guessedword' vector into a string
                if(guessedWordStr.compareTo(wordStr) == 0){ //checks if the user found all the character
                    System.out.println(" -> YOU WON!!!!");
                    break;
                }
            }
            
            if(!wordStr.contains(guessIt)){
                System.out.println("Sorry, you got that wrong.");
                MAX_NO_GUESS--;
                for(int k=0;k<words[wordIndex].length();k++){
                    System.out.print(guessedWord[k]);
                    System.out.print(" ");
                }
            }
            
            if(MAX_NO_GUESS == 0){
                System.out.println(" -> Sorry, your man hung.");
            }
        }
    }
}