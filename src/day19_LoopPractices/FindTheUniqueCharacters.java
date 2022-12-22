package day19_LoopPractices;

public class FindTheUniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";




        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int countFrequency = 0;// represents the frequency of the ch...

            for (int j = 0; j <str.length() ; j++) { //compares the characters that outer loop picked, with each characters of the string...

                char eachChar = str.charAt(j);

                if (ch==eachChar){
                    countFrequency++;
                }
                }
            if (countFrequency >= 1){ //if the frequency of the characters is 1, then the character is unique...
                result +=ch;
            }

            /*another way
            if (count !=1){
            continue;
            }
            */

        }
        System.out.println(result);

        }

    }


/*Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
            then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */