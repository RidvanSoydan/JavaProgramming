package day24_CustomMethods_Return;

public class ReturnMethod_FrequencyOfChars {

    public static void main(String[] args) {

        //finding the unique characters...

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {

            int frequencyOfChars = frequency(str, str.charAt(i));

            if (frequencyOfChars == 1){
                System.out.print (str.charAt(i) + " ");
            }
        }


    }

                    //              "aaa"       'a'
    public static int frequency (String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }

        return count;
    }



}
