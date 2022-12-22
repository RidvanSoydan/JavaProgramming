package day16_ForLoopAndStringPractices;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index       01234567891011

        String reverseOfStr = "";       //contain the reversed version of str
        //noopS nedooW

       /*reverseOfStr += str.charAt(str.length()-1); // index (11) ==> n ==> last index
         reverseOfStr += str.charAt(10); //on
         reverseOfStr += str.charAt(9); //oon
         result += str.charAt(8); //p
         result += str.charAt(7); //S
         result += str.charAt(6); //' '
         result += str.charAt(5); //n
         result += str.charAt(4); //e
         result += str.charAt(3); //d
         result += str.charAt(2); //o
         result += str.charAt(1); //o
         result += str.charAt(0); //W */


        for (int i = str.length()-1; i >= 0 ; i--) { //i: index number of str, starting last index to index 0...

            reverseOfStr += str.charAt(i); // + ==> concatenation, adding each character to reverseOfStr

        }

        System.out.println("Reverse of " + str + " is " + reverseOfStr);


        /*Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

         */

        String str2 = "I love Java, Java is fun programming language";

        String reverseOfStr2 = "";

        for (int i = str2.length()-1; i >= 0 ; i--) {

            reverseOfStr2 += str2.charAt(i);

        }
        System.out.println("reverseOfStr2 = " + reverseOfStr2);


    }
}
