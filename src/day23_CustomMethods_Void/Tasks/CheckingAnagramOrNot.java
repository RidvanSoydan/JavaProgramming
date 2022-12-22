package day23_CustomMethods_Void.Tasks;

import java.util.Arrays;

public class CheckingAnagramOrNot {

    public static void main(String[] args) {

        anagramCheck ("silent", "listen");
    }

    public static void anagramCheck (String str1, String str2){

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1, ch2)){
                System.out.println( str1 + " and " + str2  + " are anagram");
            }else{
                System.out.println(str1 + " and " + str2  + " are not anagram");
            }
        }


    }

    /*
    create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")

			output:
				silent and listen are anagram
    */