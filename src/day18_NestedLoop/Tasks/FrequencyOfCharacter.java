package day18_NestedLoop.Tasks;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aaaaaaabcccdefgssssss";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //// each characters from string...
            int countFrequency =0;

// outer loop gets each characters from string and inner loop finds the frequency of characters...

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i); // to find the frequency of each characters...

                if (ch == each){
                    countFrequency++;
                }
            }
            if (result.contains("" + ch)){
                continue;
            }

            result +=ch;
            result +=countFrequency;
        }

        System.out.println("result = " + result);





        /*Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters

         */
    }
}
