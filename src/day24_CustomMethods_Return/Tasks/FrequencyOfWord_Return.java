package day24_CustomMethods_Return.Tasks;

public class FrequencyOfWord_Return {

    public static void main(String[] args) {

        String sentence = "java JavA jaVA python PYTHON";
        String word = "JAVA";

        int result = frequencyOfWord (sentence, word);

        System.out.println("result = " + result);
    }

    public static int frequencyOfWord (String str, String word) {

        int frequency = 0;

        str = str.toLowerCase();
        word = word.toLowerCase();
        
        while (str.contains(word)){
            
            str = str.replaceFirst(word, "");
            frequency++;
        }
        return frequency;
    }

}
/*create a method named frequencyOfWord that passes two parameters:
	    string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */