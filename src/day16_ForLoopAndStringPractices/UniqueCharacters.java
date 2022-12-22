package day16_ForLoopAndStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccddeff";

        String result = "";

        /*char ch = 'a';

        if (str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index numbers of chars are same then the char is unique

            result +=ch;

        }
        System.out.println("result = " + result); */


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //ch: each characters of str...
            System.out.print(ch); //each characters

            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of characters are same
                                                            // then characters is unique
                result += ch;

            }

        }
        System.out.println();
        System.out.println("result = " + result);
/*
Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */


        }

    }