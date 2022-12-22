package day21_ForEachLoop.FreeTask;

import java.sql.SQLOutput;

public class LongestRepetitiveSubstring {

    public static void main(String[] args) {

        String str = "abcababcababcab";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < (str.length() / 2) + 1; j++) {

                String each = str.substring(i, j);

                if (str.substring(str.length() / 2).contains(each) && result.length() < each.length()) {
                    result = each;
                }
            }
        }

        if (result.isEmpty()){
            System.out.println("There is no repetitive substring");
        }
        System.out.println(result);

    }
}
        /*
         Longest Repetitive Substring -- Real Interview Task


    		Write a program if some substring K that can be repeated N>1 times
    		    to produce the input string exactly as it appears.
    		Your program should return longest substring K, and
    		if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef
    					   str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
    					   str =" abcdef"				       output should be "There is no repetitive substring"

         */


