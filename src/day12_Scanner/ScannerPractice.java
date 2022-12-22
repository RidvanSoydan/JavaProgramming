package day12_Scanner;

//import java.util.*;         // '*' seen replit is wild import, imports everything from the package, it costs more, takes more memory...
import java.util.Scanner;   //You need to import what you need. I just only need Scanner now.
                            // regular import : imports one class
public class ScannerPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);                          //System.in is arguments, that argument decides
                    // new is object, Scanner is constructor;           // what you will use scanner for.
                    //Constructor names must be same with class name    //  If I want to connect scanner my keyword
                                                                        //to the program I will call System class and in (which stands for input)
        System.out.println("Enter a number between 1 ~ 7");

       //byte num = (byte) scan.nextInt();          //nextByte(), nextShort(), nextInt, nextLong, nextFloat(), nextDouble()...
                    //Explicit casting

        int num = scan.nextInt();

        String result = "";

        if (num >=1 && num<=7){ //7 outputs

            if (num ==1){
                result = "Monday";
            }else if (num ==2){
                result ="Tuesday";
            }else if (num ==3){
                result ="Wednesday";
            }else if (num ==4){
                result ="Thursday";
            }else if (num ==5){
                result ="Friday";
            }else if (num ==6){
                result ="Saturday";
            }else {
                result ="Sunday";
            }
            System.out.println("result = " + result);

        }else {
            result = "Invalid Number";

            System.out.println("result = " + result);
        }


        System.out.println("-----------------------------------------");


        System.out.println("Enter a number between 1 ~ 7");

        int num2 = scan.nextInt();

        String result2 = "";

        if (num2 >=1 && num2<=7){ //7 outputs

            result2 = (num2 == 1) ? "Monday" : (num2 == 2) ? "Tuesday" : (num2 == 3) ? "Wednesday" : (num2 == 4) ? "Thursday"
                    : (num2 == 5) ? "Friday" : (num2 == 6) ? "Saturday" : "Sunday";

            System.out.println("result2 = " + result2);

        }else {
           result2 = "Invalid Number";

           System.out.println("result2 = " + result2);

        scan.close ();
        }
        }



    }
