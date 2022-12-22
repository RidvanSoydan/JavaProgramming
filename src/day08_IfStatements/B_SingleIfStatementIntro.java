package day08_IfStatements;

public class B_SingleIfStatementIntro {

    public static void main(String[] args) {
                                                //Every single possible outputs you can create Single If statement
                                                //If you have multiple conditions you can create multiple Single If statement

        int number = 100; // odd number (tek sayı) or even number (çift sayı)

        /*...*/
        boolean evenNumber = number%2 == 0;
        // boolean oddNumber = number%2 != 0; // this is not needed because a number can be even or odd, so even or !even can be used.

        if (evenNumber) {    //true       // semi colon (;) ends the if statement, so you must use curly braces ( {} )
            System.out.println( number + " is even number");

            //if the condition is true then the single if statement will be executed,
            //if it is not true it wont be executed
        }

        if (!evenNumber){  //not even number, odd number   //false
            System.out.println(number + " is odd Number");

        }
        System.out.println("---------------------------------------------------");

        int n = 200; // there are 3 possible outputs so we need to create 3 single if statements

        // positive

        //boolean positive = n > 0;
        //boolean negative = n > 0;  there is no need for this
        //boolean zero = n == 0;

        if (n > 0) { // if the number is greater than zero, then it is positive
            System.out.println(n + " is positive");
        }

        //negative

        if (n < 0) { // if the number is less than zero, then it is negative
            System.out.println(n + " is negative");
        }

            // is zero

        if (n == 0) {
            System.out.println(n + " is zero");
        }













    }




    }


