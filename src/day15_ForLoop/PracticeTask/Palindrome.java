package day15_ForLoop.PracticeTask;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a sentence");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();

        String result = "";



        for (int i = sentence.length()-1; i >= 0; i--) {

            char ch = sentence.charAt(i);
            result +=ch;

        }

        boolean isPalindrome = sentence.equalsIgnoreCase(result);

        if (isPalindrome){
            System.out.println("\"" + sentence +"\"" + " is Palindrome");

        }else {
            System.out.println("\"" + sentence +"\"" + " is NOT a Palindrome");
        }


        //Another way

        String str = "Java";

        String result1 = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            result1 += str.charAt(i);
        }

        boolean isPalindrome2 = str.equalsIgnoreCase(result1);

        System.out.println(isPalindrome2);





/*8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level
				output:
					true


				input:
					Anna
				output:
					true

 */
    }
}
