package day09_IfStatements.__homeWork;

public class CharacterIdentity {

    public static void main(String[] args) {

        /* Create a class called Character Identity, and write a program that can
            identify if the given character is a digit or Alphabetic Character(A~Z
            or a~Z) or a special character
            Ex:
            ch = '@'
            output:
            Special Character

            HINT: You may wanna check out the numbers of the chracters on ASCII table
         */


        char character = '0';
        String typeOfCharacter;

        if (character >= '0' && character <= '9'){
            typeOfCharacter = "Digit";
        } else if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            typeOfCharacter = "Alphabetic Character";
        } else {
            typeOfCharacter = "Special Character";
        }
            System.out.println(character + " is " + typeOfCharacter);



        }

}







