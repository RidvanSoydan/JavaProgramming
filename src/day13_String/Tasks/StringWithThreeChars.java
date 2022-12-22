package day13_String.Tasks;

import java.util.Scanner;

public class StringWithThreeChars {

    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int lenght = str.length();
        scan.close();

        if (lenght == 0){
            System.out.println("String is empty");
        }else if (lenght <=3 ){
            System.out.println(str);
        }else {
            System.out.println(""+str.charAt(lenght-3) + str.charAt(lenght-2) + str.charAt(lenght-1));
        }




        /*5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

         */


    }

}
