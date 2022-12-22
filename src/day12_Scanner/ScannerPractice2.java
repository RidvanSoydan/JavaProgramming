package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //Boolean methods ==> User can provide just ONLY TRUE or FALSE inputs, not expressions also: 1<2 ==> give error

        //System.out.println("Enter true or false:");

        //boolean result = scan.nextBoolean();



        // next () method ==> Returns input as a String, reads the inpu only UNTIL A SPACE....One Word Method

        System.out.println("Enter your name");

        String name = scan.next(); // Rıdvan Soydan + Enter

        System.out.println("name = " + name); // It reads only Rıdvan...Soydan wont be read by next method...

        scan.close();






    }
}
