package day19_LoopPractices.Tasks;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "aaaabbşlkkkdjhhggghghhgfgağterlkjkkkjşfgkjpowqkjasdgghtd";


        int highestFrequency = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    frequency++;}
            }
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                result= ch + "";

            } else if (frequency==highestFrequency && !result.contains(str.substring(i,i+1))) {
                result += ch + " ";
            }

        }
        System.out.println(result + " " + highestFrequency);


    }
}






//Write a program that can find the character that has the highest frequency from a string