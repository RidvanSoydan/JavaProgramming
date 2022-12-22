package day17_While_DoWhile.Task;

import java.util.Scanner;

public class MultiplyAndDivisionWithoutOperator {

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

        int multiplication = 0;

        for (int i = 1; i <= number; i++) {

            multiplication += number2;

        }
        System.out.println("Multiplication of " + number + " and " + number2 + " is " + multiplication);

        System.out.println();
        System.out.println("-----------------Division-------------------------------");
        System.out.println();

        System.out.println("Enter dividend(numerator)");
        int num1 = scan.nextInt();

        System.out.println("Enter divisor(denominator)");
        int num2 = scan.nextInt();

        int division = 0;

        if (num1>0 && num2>0){

            while (!(num1 - num2 < 0)) {
                division++;

                num1 = num1 - num2;
            }

            System.out.println("Division result is " + division + " with remainder of " + num1);

        }else {
            System.out.println("Invalid number!");
        }

        System.out.println("**********Division*******************");

        System.out.println("Enter a number");
        int num4 = scan.nextInt();//30

        System.out.println("Enter another number");
        int num5 = scan.nextInt();//7

        int howmany =0;
        int remeinder=0;

        while (num4 >= num5) {//23-7-1;16-7-2;9-7-3;2-7-4
            num4-=num5;
            howmany++;
            remeinder = num4;
        }
        System.out.println("howmany = " + howmany);
        System.out.println("remeinder = " + remeinder);



        scan.close();

        /*Write a program that can divide two positive numbers
        without using / (division) and * (multiplication) operators.*/

        }
    }
