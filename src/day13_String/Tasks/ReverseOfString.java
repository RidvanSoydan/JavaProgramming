package day13_String.Tasks;

import java.util.Scanner;

public class ReverseOfString {

    public static void main(String[] args) {

/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        
        if (word.length() == 5){
            word = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
            System.out.println("word = " + word);
        
        }else {
            
            if (word.length() > 5){
                System.out.println("Too long!");
            } else {
                System.out.println("Too short!");
            }
        }
        



        
    }
}
