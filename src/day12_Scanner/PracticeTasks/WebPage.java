package day12_Scanner.PracticeTasks;

import java.util.Scanner;

public class WebPage {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);


        System.out.println("MY WEBSITE");

        System.out.println("sign up or log in");

        String entrance = input.nextLine();
        if(entrance=="sign up"){

            System.out.println("Enter your email:");
            String mail = input.next();
            System.out.println("Enter your password:");
            String pass = input.next();
            System.out.println("Welcome");

        } else if (entrance=="log in") {

            System.out.println("Enter your email:");
            String email = input.next();
            //if(email == mail = input.next(); ) // The error is here. The compiler doesn't accept the mail
                System.out.println("Enter your password:");
            String password = input.next();
            System.out.println("Welcome");

        }else{
            System.out.println("Invalid");
        }


    }
}
