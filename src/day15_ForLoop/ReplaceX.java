package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        String word = "xcodeX"; 

        word = word.replace("x", "a"). replace("X", "a"); 
                    //"acodex"                          //"acodea"

        System.out.println("word = " + word);

        /*2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

         */

    }
}
