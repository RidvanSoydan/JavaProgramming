package day41_Exceptions;

import java.sql.SQLOutput;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try {  //try block did not executed

            System.out.println(9/0);    // Not executed
            System.out.println("Try Block"); // Not executed

        } catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occurred");
        }

       // System.out.println(9/0); // java.lang.ArithmeticException: / by zero

        System.out.println("Test Completed");






    }


}
