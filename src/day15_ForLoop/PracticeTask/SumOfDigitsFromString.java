package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class SumOfDigitsFromString {

    public static void main(String[] args) {

        System.out.println("Please enter a string containing digits, alphabetics and special caharacters;");

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        scan.close();

        int sumOfDigits = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= '0' && ch <= '9'){

                System.out.println("ch = " + ch);
                sumOfDigits +=ch;

            }
        }System.out.println("sumOfDigits = " + sumOfDigits);


        /* 6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

         */
    }
}
