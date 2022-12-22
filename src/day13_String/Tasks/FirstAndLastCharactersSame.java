package day13_String.Tasks;

public class FirstAndLastCharactersSame {

    public static void main(String[] args) {

        String str = "AlivelikırkdokuzA";

        int lengt = str.length();

        if (str.substring(0,1).equals(str.substring (lengt-1))) {

            System.out.println("First and last characters are SAME");

        } else {
            System.out.println("First and last characters are NOT SAME");;
        }


        /*3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

         */



    }
}
