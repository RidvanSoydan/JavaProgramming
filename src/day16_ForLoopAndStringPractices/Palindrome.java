package day16_ForLoopAndStringPractices;

public class Palindrome {


    public static void main(String[] args) {


        String str = "NeBanaSenNeSanaBen";


        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            reversed += str.charAt(i);

        }
        boolean isPalindrome = str.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


/*
 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
 */



    }
}
