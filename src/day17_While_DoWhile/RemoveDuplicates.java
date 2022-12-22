package day17_While_DoWhile;

public class RemoveDuplicates {


    public static void main(String[] args) {


        String str = "AABBCC";

        String result = ""; // result "ABC"

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i); // A A B B C C

            if (result.contains(ch)) { //if the result contains character
                continue; // skips
                //break; exits

            }result += ch;
        }
        System.out.println("result = " + result);






    }
}
