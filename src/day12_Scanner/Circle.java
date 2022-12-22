package day12_Scanner;

import java.util.Scanner;

public class Circle {

    /*1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double r = scan.nextDouble();

        double areaOfCircle = 3.14 * r * r;

        System.out.println("Area = " + areaOfCircle);

        System.out.println("-----------------");

        double perimeterOfCircle = 2 * 3.14 * r;

        System.out.println("Perimeter = " + perimeterOfCircle);

        scan.close ();


    }
}
