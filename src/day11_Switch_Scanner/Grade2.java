package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'E';
        // String result = "":
        switch (ch) {
                        //You cannot write like this case 'A' || 'B' || 'C' .... because it returns as boolen, && or || CANNOT be WRITTEN
            case 'A':  case 'B':  case 'C':  case 'D':
                System.out.println("Passed");
                //result = "Passed"
                break;

            case 'F':
                System.out.println("Failed");
                //result = "Failed"
                break;

            default:
                System.out.println("Invalid");


        }

        /*if grade is A, B, C, D == passed
                otherwise ========= failed

         */

    }
}
