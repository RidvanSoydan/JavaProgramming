package day13_String.Tasks;

import java.util.Scanner;

public class FirstAndLastCharacters {

    public static void main(String[] args) {

        System.out.println("Enter a sentence");
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        scan.close();

        int lenght = sentence.length();

        char firstCh = sentence.charAt(0);
        char lastCh= sentence.charAt(lenght-1);


        System.out.println(firstCh + " " + lastCh);




        /*1. write a program that asks user to enter a sentence.
        then print the first & last characters of the sentence

        */
    }
}
