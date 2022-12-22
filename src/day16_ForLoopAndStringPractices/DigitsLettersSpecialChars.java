package day16_ForLoopAndStringPractices;

public class DigitsLettersSpecialChars {


    public static void main(String[] args) {


        String str = "ABCDE1234567890) (*&^%$#@!";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //each characters...

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                letters += ch;

            } else if (ch >= '0' && ch<='9'){
                digits +=ch;

            } else {
                if (ch != ' '){ // if the special character are not space (' ')
                specialChars +=ch;
            }
            }

        }System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);





    }
}
