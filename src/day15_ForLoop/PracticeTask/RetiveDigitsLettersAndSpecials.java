package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class RetiveDigitsLettersAndSpecials {

    public static void main(String[] args) {

        System.out.println("Enter a word");

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();

        int length = word.length();
        char character;
        String letters ="";
        String digits = "";
        String specialChars ="";

        for (int i = 0; i < length; i++) {

            character = word.charAt(i);

            if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'){

                letters = letters + character;

            }else if (character >= '0' && character <= '9') {

                digits = digits + character;

            }else {

                specialChars = specialChars + character;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


        /*5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
        
         */



    }
}