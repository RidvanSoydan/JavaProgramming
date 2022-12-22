package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class avaJ {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        String reverse = "";

        for (int i = word.length() - 1 ; i >= 0; i--) {

        reverse += word.charAt(i);

        }
        System.out.println("reverse = " + reverse);

        scan.close();


        /*Write a program that can reverse any given string

      			String str = "Java"; ==> avaJ
      		 //			      0123

         */



    }
}
