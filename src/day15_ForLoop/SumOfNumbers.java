package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

// 3. Write a program that can calculate the sum of all integers between 1 to 100

        int sum = 0;  //to be able to find sum of number from 1 to 100, we give 0 value to the sum variable
                         //when we sum any number with 0, result is the number itself...

        ///SHORTCUT fori + Enter
        for (int i = 1; i < 101; i++) { //i: 1,2,3,4 ...100

            sum += i;

        }  System.out.println(sum);

        System.out.println("------------------------------");

        //another way by using scanner
        //sum of number given by user

        int total = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

        System.out.println("Enter a number");
        total += scan.nextInt();

        }
        System.out.println("total = " + total);
        scan.close();

        /*System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();*/

    }
}
