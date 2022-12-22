package day19_LoopPractices.Tasks;

public class IndexOfFirstUnique {

    public static void main(String[] args) {

        String str = "aaaabbccçddeeffgghtd";
                //    012345678910
        String uniqueCharacters = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // each character
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                char eachChar = str.charAt(j);

                if (eachChar == ch) {
                    frequency++;

                }

            }if (frequency <= 1) {
                uniqueCharacters += "" + ch;

            }

        }
            System.out.println("Unique characters : " + uniqueCharacters);
            System.out.println("Index of first uniquecharacter : " + str.indexOf(uniqueCharacters.charAt(0)));




        //Write a program that can return the index number of the first unique character.
    }
}
