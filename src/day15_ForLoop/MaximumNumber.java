package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        //if you want to repeat it it should always be inside loop body, if you want one time it can be outside the loop

        Scanner scan= new Scanner(System.in);
        int maxNumber = -2147483648; //minimum int number..any number given by user will be bigger than -2147483648...
                        //temporary value
                        // first number user entered, going to replace minimum int number (-2147483648)...
                        //second number user entered will be compared with the first one...

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt(); //1,2,3,1,5...

            if (num > maxNumber){ //if the user entered number is greater than current maximum number
                                  // when I enter 1, is the 1 bigger than -2147483648?
                maxNumber = num;  //to be able to replace max number from -2147483648 to 1
                                  //we are continuously reassigning the maxNumber value...
                                  //we will only reassign it under if (num > maxNumber) condition,
                                                             //    if this condition false, it wont reassign...
             }
        }
        System.out.println("maxNumber = " + maxNumber);


        scan.close();


        /* Write a program that asks the user to enter a number for 5 times.
        return the maximum number
        */

    }
}
