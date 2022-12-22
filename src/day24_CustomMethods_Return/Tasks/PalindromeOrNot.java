package day24_CustomMethods_Return.Tasks;

public class PalindromeOrNot {

    public static void main(String[] args) {

    String word = "Level";

    boolean isPalindrome = isPalindromeOrNot(word);
        System.out.println(word + " is palindrome ==> " + isPalindrome);

    }

    public static boolean isPalindromeOrNot (String str){

        boolean isPalindrome = false;

        String result = "";

        for (int i = str.length()-1; i >=0; i--){

            char ch = str.charAt(i);
             result += ch;
        }

        if (result.equalsIgnoreCase(str))
            isPalindrome = true;

        return isPalindrome;
}

}
/*
       By using the reverse method above to create another method named isPalindrome
	   that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */