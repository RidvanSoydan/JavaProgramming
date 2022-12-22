package day24_CustomMethods_Return.FreeTasks;

public class FirstAndLastCharsExchanged {

    public static void main(String[] args) {

        firstAndLastCharsExchanged("zeynep");

        System.out.println("**************************************");

        firstAndLastCharsExchanged("isabella");
    }


    public static String firstAndLastCharsExchanged (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (i == 0){
                ch = str.charAt (str.length()-1);
            }

            if( i == str.length()-1){
                ch = str.charAt(0);
            }
            result += ch;
        }

        System.out.println(result);
        return result;

    }

    /*

    Task 6 : Write a method that return a new string where the first and last chars have been exchanged.

             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"

     */

}
