package day16_ForLoopAndStringPractices.Tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Büyük Ali çok hızlı, küçük Ali çok yaramaz";

        String word = "Ali";

        int frequencyOfWord = 0;

        for (int i = 0; i < sentence.length()-3; i++) {

           String eachSub = sentence.substring(i, i+3);

           System.out.println("eachSub = " + eachSub);

           if (eachSub.equals(word)){

                frequencyOfWord ++;
            }

        }System.out.println("Frequency of " + word + " is " + frequencyOfWord);

        /*write a program that can return the frequency of the a word Java from the sentence

            Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create



         */



    }
}
