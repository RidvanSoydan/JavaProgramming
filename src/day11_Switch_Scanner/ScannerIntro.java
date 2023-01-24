package day11_Switch_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerIntro {

        public static void main(String[] args) {


        Scanner input =                 new Scanner                             (System.in).useLocale(Locale.US);

     //variableNamesMustBeMeaningfull   //constructor of scanner        //in this contsructor we need to pass arguments
   //constructor has special            // that arguments is going to decide what you use the
   //names like class names             // scanner for.
                                        //object                        // in means getting, out means displaying in console

//Once you write scanner object, your program is linked to your keyboard

                //**** SHORTCUT; Write Scan and hit the Enter

                //Once you declare Scanner object, now we can use the methods of the scanner
                //Scanner class provides us the methods to get input
                //Scanner method types counted in the slide 7.
                //Those methods are going to decide what kind of input that user can provide.
                //If I don't call any method of scanner when I run my program I cannot type anything to the console
                //If you want to type to the console you need to use Scanner methods

                System.out.println("Enter an integer:");

                int num1 = input.nextInt();

                System.out.println("Enter a decimal:");

                double num2 = input.nextDouble();


                System.out.println(num1);
                System.out.println(num2);
                System.out.println("Multiplication: " + (num1 * num2));

               input.close (); //closes the scanner, after this scanner can not be used anymore

                System.out.println("Enter an integer: ");
        }
}
















