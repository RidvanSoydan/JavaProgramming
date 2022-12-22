package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int minNumber = 2147483647; //max integer, any number that user enter will be less than 2147483647...

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number < minNumber){
                minNumber =number;
            }
        }
        System.out.println("minNumber = " + minNumber);

        scan.close();


         /* Write a program that asks the user to enter a number for 5 times.
        return the minimum number
        */



    }
}
