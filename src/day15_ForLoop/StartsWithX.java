package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

    System.out.println ("Enter a word: ");

    String word =new Scanner(System.in).next(); //xcodex
                //scanner object
                // if you want one input from the user, you need to create scanner object, no need to write scanner variable ....

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a"); //acodex

            System.out.println("word = " + word);
        }





    /*
    Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
     */
}
}
