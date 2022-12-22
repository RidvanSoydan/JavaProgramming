package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {



        //String Method== > char at () ==> returns the character at the given index, returns char


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();


        char f = firstName.charAt(0); //All index number is integer so int will be used.
        char l = lastName.charAt(0);

        //Initials means first character of first name and first character of last name...

        // String initial = f + l;  //This is not concatenation because there is no string left or right side of +..
                                    // So we will add string by ""
        String initial = f +". " + l + "."; //This is not concatenation because there is no string

        System.out.println("initial = " + initial);

        scan.close();
    }

}
