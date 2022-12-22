package day09_IfStatements.__homeWork;

public class CharacterIdentity2 {

    public static void main(String[] args) {


        char character = 48;

        String typeOfCharacter;

        if (character >='0' && character <= '9') {
            typeOfCharacter = "Digital Character";

        } else if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            typeOfCharacter = "Alphabetic Character";

        } else {
            typeOfCharacter = "Special Character";
        }
        System.out.println(typeOfCharacter);
    }
}







