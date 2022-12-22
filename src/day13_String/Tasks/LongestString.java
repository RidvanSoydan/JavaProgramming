package day13_String.Tasks;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.println("Enter another string: ");
        String sentence2 = scan.nextLine();
        scan.close();

        int lenght = sentence.length();
        int lenght2 = sentence2.length();

        if (lenght > lenght2){
            System.out.println("\"" +sentence + "\" is the longest string");
        } else {
            System.out.println( "\"" + sentence2 + "\" is the longest string");
        }




        /*write a program that asks user to enter two strings, and print out the longest string*/



    }
}
