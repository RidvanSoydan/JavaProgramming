package day14_String.Task;

import java.util.Scanner;

public class StartWithX {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a word:");
            String word = scan.next();

            if(word.charAt(0) == 'x' || word.charAt(0) == 'X'){
                word = word.substring(1); //  word = word.replaceFirst("x", "");, or:

            }

            System.out.println(word);
            scan.close();
        }
    }

    /* 3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
     */


