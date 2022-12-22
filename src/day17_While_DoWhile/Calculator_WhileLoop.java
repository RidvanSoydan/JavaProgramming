package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator_WhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter a number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator"); //if the user enters anything other than math operators
        char ch =scan.next().charAt(0);              // enter a math operator...



        /*if (!(ch == '+' || ch == '-')) { //just one time it asked "Invalid Operator, Please re-enter"

            System.out.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch =='+')? num1+num2: num1-num2);*/


        while (!(ch == '+' || ch == '-')) { //if the operators is invalid...

            System.err.println("Invalid Operator, Please re-enter"); //Number of repeating is unknown...
            ch = scan.next().charAt(0);
        }

        System.out.println((ch =='+')? num1+num2: num1-num2);


        //Another way with for loop but not advised..

        /*for (int i = 0; !(ch == '+' || ch == '-');) {
            System.err.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);

        }
        System.out.println((ch =='+')? num1+num2: num1-num2);*/



        scan.close();


    }
}
