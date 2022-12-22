package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class Within10Of100Or200 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scan.nextInt();

        for (int i = 0; i <= 0; i++) {

            boolean result = Math.abs (number - 100) <= 10 || Math.abs (number - 200) <= 10;

            if (result) {
                System.out.println("result = " + result);
            } else {
                System.out.println("result = " + result);
            }

        }

        //Another way without For Loops

        System.out.println("Enter a number");

        int number2 = scan.nextInt();
        scan.close();

        System.out.println("number2 = " + number2);

        boolean result2 = Math.abs (number2 - 100) <= 10 || Math.abs (number2 - 200) <= 10;

            if (result2) {
                System.out.println("result = " + result2);
            } else {
                System.out.println("result = " + result2);
            }

        }


        /*Given an int n, print true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.

         */
    }

