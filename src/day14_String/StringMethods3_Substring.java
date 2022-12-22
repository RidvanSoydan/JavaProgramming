package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //Substring () methods ==>in order to create sub string value
            //1. Substring (beginning index, ending index)
            //2. By counting...

        String word = "Cydeo School";
        System.out.println("word = " + word);
        String word2 = word.substring(0, 4+1);// Ending index always excluded, so you need to write ending index + 1
        System.out.println("word2 = " + word2);

        String word3 = word.substring(6); //if you want to create substring from any index number till the end you dont need to write ending index...
        System.out.println("word3 = " + word3);

        System.out.println("--------*****-------");

        String word4 = "Java Programming Language";

        int firstSpace =word4.indexOf(" "); //4
        String s1  = word4.substring(0, word4.indexOf(" "));


        int firstP = word4.indexOf("P"); //5
        int lastSpace = word4.lastIndexOf (" "); //16
        String s2 = word4.substring(word4.indexOf("P"), word4.lastIndexOf (" "));


        int firstL= word4.indexOf("L"); //17
        String s3 = word4.substring(word4.indexOf("L"));


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("------*****----------");

        String word5 = "Python C# Ruby";

        String s4  = word5.substring(0, word5.indexOf(" "));
        String s5 = word5.substring(word5.indexOf("C"), word5.lastIndexOf (" "));
        String s6 = word5.substring(word5.indexOf("R"));

        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);

        //if you have spaces before the first word or after the last word, call the trim method...



    }
}
