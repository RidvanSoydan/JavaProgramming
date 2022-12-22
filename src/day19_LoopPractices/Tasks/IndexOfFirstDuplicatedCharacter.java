package day19_LoopPractices.Tasks;

public class IndexOfFirstDuplicatedCharacter {

    public static void main(String[] args) {

        String str = "aaaabbccçddeeffgghtd";
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
                if(duplicateCharacters.contains("" + ch)){
                    continue;
                }
                duplicateCharacters += "" + ch;
            }
        }
        System.out.println("Duplicated characters = " + duplicateCharacters);
        System.out.println("Index of first duplicated character = " + str.indexOf(duplicateCharacters.charAt(0)));

        //Write a program that can return the index number of the first duplicated character from a string
    }
}
