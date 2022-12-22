package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        // nextLine (); ==> Returns input as a String, reads the entire input until the new line (press enter)
        //              ==> Reads everthing once you hit the Enter....
        //              ==> if you use nextLine () method after the other scanner methods, you MUST USE scan.nextLine();
        //              ==> before the nextLine () method you used to be able take Enter key from scanner memory
        //              ==> All other scanner methots except for nextLine (), ignores Enter key.
        //              ==>nextLine method takes everything that the scanner has...

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");

        String fullName = scan.nextLine(); // Rıdvan SoydanEnter

        System.out.println("Enter your Programming Language");
        String programming = scan.nextLine(); //Java Programming LanguageEnter

        System.out.println("Enter your Age");
        int age = scan.nextInt();       //nextInt wont read Enter key, when you hit the enter you see
                                        // "Enter your School Number" but not allowed to write anything

        scan.nextLine(); //To be able to read Enter, I must write nextLine();
                         //capture the Enter key that user pressed for nextInt (); THIS IS THE ONLY WAY...

        System.out.println("Enter your School Number");
        String schoolNumber = scan.nextLine();
        
        System.out.println("name = " + fullName);
        System.out.println("Programming Language = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolNumber = " + schoolNumber);

        scan.close();


    }
}
