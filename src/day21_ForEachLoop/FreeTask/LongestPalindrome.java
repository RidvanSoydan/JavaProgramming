package day21_ForEachLoop.FreeTask;

public class LongestPalindrome {

    public static void main(String[] args) {

        String[] arr = {"java","longer word","civic","apple","racecar","mom","anna"};

        String result = "";
        int count = 0;

        for (String each : arr) {

            String temp = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                temp += each.charAt(i);

            }

            if(temp.equals(each) && temp.length() > result.length()) {
                result = temp;
                count++;
            }
        }

        if(count == 0)
            System.out.println("No Palindrome");
        else
            System.out.println(result);


        System.out.println("--------------------------------------------------------");


        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        // we need to get word one by one

        /*
        0123456
        racecar
         */
        String longestPalindrome="";

        for (String eachWord : words) {

            //is palindrome or not
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length() / 2; i++) {
                //"racecar"
                char ch1 = eachWord.charAt(i);
                char ch2 = eachWord.charAt(eachWord.length() - i - 1);

                if (ch1!=ch2){
                    isPalindrome=false;
                    break;
                }


            }

            if (isPalindrome&&eachWord.length()>longestPalindrome.length())
                longestPalindrome=eachWord;

        }
        System.out.println(longestPalindrome);


        }
    }



        /*
         Task 4 :  For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
         */


