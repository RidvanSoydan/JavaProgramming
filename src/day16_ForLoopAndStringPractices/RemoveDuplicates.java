package day16_ForLoopAndStringPractices;

public class RemoveDuplicates {


    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = "";   //final result = abc

        for (int i = 0; i <= str.length()-1; i++) { // i: represents all the index numbers of str (starting from 0)
                     // i <= 7 ==> i < 8

            String ch = "" + str.charAt(i); //represents each character of str...

            if (!result.contains(ch)) {   // if the character is not contained in the result...

                result += ch;

            }
            }

            System.out.println("result = " + result);

        }

        /*
             Write a program that can remove the duplicated characters from a String
			    Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */
    }

