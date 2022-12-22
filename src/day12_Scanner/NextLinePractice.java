package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine(); //To be able to take Enter key from scanner...

        // The only time you need write extra nextLine () method is: using nextLine () after any other methods.

        System.out.println("Enter your full name");
        String fullName = scan.nextLine ();


        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();

        scan.nextLine(); //To be able to take Enter key from scanner...

        System.out.println("Enter your School Name");
        String schoolName = scan.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();




        /*
        1. Ask the user to enter age (nextInt ())
        2.Ask the user to enter full name (nextLine ())
         */





    }
}
