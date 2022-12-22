package day19_LoopPractices.Tasks;

public class DisplayingTwiceCharacters {

    public static void main(String[] args) {

        String str = "aaccdd12332411565688797";
        //    012345678910
        String duplicateCharacters = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // each character
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                char eachChar = str.charAt(j);

                if (eachChar == ch) {
                    frequency++;
                }

            } if (frequency == 2) {
               duplicateCharacters += "" + ch;

            }

            } System.out.println("Duplicated characters = " + duplicateCharacters);
        }





       // Write a program that can display all the characters that appeared twice in the string.
    }

