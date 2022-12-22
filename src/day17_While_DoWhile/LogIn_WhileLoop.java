package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn_WhileLoop {

    public static void main(String[] args) {

        // username: "Cydeo"
        //password: "Cydeo123"

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter username");
        String username = scan.nextLine();

        System.out.println("Enter password");
        String password = scan.nextLine();

        if (username.equals("Cydeo") && password.equals("Cydeo123")){ //if credentials are valid...

            System.out.println("Logged in");

        } else {

            int attemps = 3; // 3, 2, 1...

            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attemps > 0) {
                //while the credentials are invalid, user will have attempt...

                if (attemps == 1) {

                    System.out.println("This is your last chance!!!");

                }
                System.out.println("Incorrect username or password, please re-enter");

                System.out.println("Enter username");
                username = scan.nextLine();

                System.out.println("Enter password");
                password = scan.nextLine();

                attemps--;
            }

            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");

            } else {
                System.out.println("Your account locked");
            }

        }






}

}

