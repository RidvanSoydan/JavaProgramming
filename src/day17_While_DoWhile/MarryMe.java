package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? yes/or");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {

            System.out.println("Invalid Answer, please re-enter");
            answer = scan.next().toLowerCase();
        }
            if (answer.equals("yes")) {
                System.out.println("Congrats");

            } else {
                System.out.println("Good Bye");
            }


            scan.close();
        }






        /*1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
             if the answer is yes, print "Congrats."
             if the answer is no, print "Goodbye"
             if the answer is neither yes nor no, print "Invalid answer, please re-enter" and
                    repeat it until the user enters either yes or no


         */
    }

