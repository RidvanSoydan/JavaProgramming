package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class ReversingAnyString {

    public static void main(String[] args) {

        System.out.println ("Enter something");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String result = "";


        for (int i = sentence.length()-1; i >=0 ; i--) {

            char ch = sentence.charAt(i);

            result += ch;

        }

        System.out.println("result = " + result);


        /*7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

         */



    }
}
