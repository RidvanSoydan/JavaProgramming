
package day16_ForLoopAndStringPractices.Tasks;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "Ali ata bak!";

        char ch = 'a';

        int frequencyOfChar = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ch){

                frequencyOfChar ++;
            }

        }

        System.out.print("Frequency of " + ch + " is " + frequencyOfChar);

    }


}



        /*2. Write a program that asks user to entera string and a char,
             the returns the frequency of the char from the given string
             Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4  */

