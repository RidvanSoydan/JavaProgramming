package day17_While_DoWhile.Task;

import java.util.Scanner;

public class SumOfPositiveNums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        while (!(number > 0)) {

            System.out.println("Invalid entry, Enter a positive number");
            number = scan.nextInt();
        }

        System.out.println("Enter a number");
        int number2 = scan.nextInt();

        while (!(number2 > 0)) {

            System.out.println("Invalid entry, Enter a positive number");
            number2 = scan.nextInt();

        }

        int sum = number + number2;

        System.out.println("Sum of " + number + " and " + number2 + " is " + sum);


        System.out.println("-----------------------------------");

        int sum2 = 0;

        while(true){

            System.out.println("Enter a number");
            int number3 = scan.nextInt();

            if( number3 < 0){
                break;
            }
            sum2 += number3;
        }

        System.out.println(sum2);

        scan.close();



    }

}




        /*Write a program that calculates the sum of numbers entered by the user
        until user enters a negative number.

            hint: you need an infinite loop

         */


