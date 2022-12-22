package day12_Scanner.PracticeTasks;

import java.util.Scanner;

public class FindTheResult {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type an integer number : ");
        int a = scan.nextInt();

        if (a % 3 == 0 && a % 5 == 0 && a % 15 == 0) {

            System.out.println(a + " is divisible by 3 add 20: " + (a + 20));
            System.out.println(a + " is divisible by 5 add 25: " + (a + 25));
            System.out.println(a + " is divisible by 15 add 50: " + (a + 50));

        } else if (a % 3 == 0) {//if a is divisible by 3 add 20
            System.out.println(a + " is divisible by 3 add 20 : " + (a + 20));

        } else if (a % 5 == 0) {// if a is divisible by 5 add 25
            System.out.println(a + " is divisible by 5 add 25 : " + (a + 25));

            // if the number can divisible by 3 by 5, it always divisible 15, that's why I dont need to write for 15
        } else
            System.err.println("The number is NOT divisible by 3, 5, 15");

        scan.close();

    }
}

/*
        Create a class which is "FindTheResult" create a variable
            int a=15;
                 if a is divisible by 3 add 20
                 if a is divisible by 5 add 25
                 if a is divisible by 15 add 50
         */