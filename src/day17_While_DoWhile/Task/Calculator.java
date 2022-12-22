package day17_While_DoWhile.Task;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        System.out.println("Enter a number");
        int number2 = scan.nextInt();


        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {

            System.out.println("Invalid entry, Enter a valid math operator");

            operator = scan.next().charAt(0);

        }
        double result;

       if (operator == '+') {
           result = number + number2;

       }else if ( operator == '-'){
           result = number-number2;

       }else if (operator == '*'){
           result = number*number2;

       }else {
           result = number/number2;
       }
        System.out.println("result = " + result);

        scan.close();

        /*write a program to ask user
        to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /)

         */
    }
}
