package day24_CustomMethods_Return.Tasks;

import java.util.Arrays;

public class AnagramOrNot {

    public static void main(String[] args) {

        boolean abc = isAnagram ("abcdbeefgs", "bebecfagd");
        System.out.println("isAnagram = " + abc);

    }

    public static boolean isAnagram (String str1, String str2){

        boolean isAnagramOrNot = false;

        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            isAnagramOrNot = true;

        return isAnagramOrNot;
    }

}
/*
        create a method named isAnagram that passes two String parameters,
        the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */