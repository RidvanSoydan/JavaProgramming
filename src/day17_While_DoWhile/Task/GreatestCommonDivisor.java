package day17_While_DoWhile.Task;

import java.util.Scanner;

public class GreatestCommonDivisor {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int num1 = scan.nextInt();

        System.out.println("Enter another number");

        int num2 = scan.nextInt();

        String gcd = ""; //Greatest Common Divisor (En Büyük Ortak Bölen)

        for (int i = 1; num1 > i || num2 > i; i++) {

            if (num1 % i == 0 && num2 % i == 0){

                gcd += i + " "; // Common divisors of two number...

            }

        }System.out.print(gcd);






                scan.close();
    }
}
