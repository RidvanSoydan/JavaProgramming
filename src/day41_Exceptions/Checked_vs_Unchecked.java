package day41_Exceptions;

import day39_Encapsulation_Inheritance_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(  a / b  ); // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //System.out.println("Wooden Spoon"); // If class have unchecked exception it will stop the program

        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

        // System.out.println( characters[99]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        //                                        Index 99 out of bounds for length 3

        Student student = null;

        // System.out.println( student.getName() );
        //student.study();

        final String str = "Wooden Spoon";

        // str = null;

       // System.out.println( str.toUpperCase() );

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty()); // true


        // checked Exception:

        System.out.println("Hello");

     //  Thread.sleep(3000); // checked  - compile checks this exception
                             // unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
        System.out.println("Cydeo");


    //  FileInputStream file = new FileInputStream("path of the file"); //  exception java.io.FileNotFoundException;

       System.out.println("Java".charAt(1000)); // unchecked
                                            // java.lang.StringIndexOutOfBoundsException


    }
}
