package day24_CustomMethods_Return.FreeTasks;

public class OurTrim {

    public static void main(String[] args) {

        String result = ourTrim("  Hello   ");

        System.out.println(result);

    }

    public static String ourTrim (String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            result += ch;
        }

        return result;
    }
}
/*
            Task 4 :    Write a method that can remove  all extra space from String ,
            trim() is forbidden

            // create a loop --- taking every index one by one with charAt(i)
            and compares against ' '   str.charAt(i) == ' '

            don't add empty to result, if not empty add it to result string
    			 Input: "  Hello "
        	     Output: Hello
 */
