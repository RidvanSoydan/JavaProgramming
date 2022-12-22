package day24_CustomMethods_Return;

public class ReturnMethod_RemoveDuplicateChars {

    public static void main(String[] args) {

    // create a method that can remove duplciated characters from a string and returns the new value
        //					"aaabbcccc" ===> "abc"

        String str = "aaabbcccc";

        str = removeDuplicates(str);

        System.out.println(str);

    }


    public static String removeDuplicates (String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        return result;

    }



}






