package day27_WrapperClasses.Tasks;

public class RetrieveDigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String digit="";
        String letter="";
        String character="";

       for (char each : str.toCharArray()){

           if (Character.isDigit(each)){
               digit += each;
           } else if (Character.isLetter(each)){
               letter += each;
           } else {
               character += each;
           }
       }
        System.out.println("Characters : " + character);
        System.out.println("Letters : " + letter);
        System.out.println("Digits : " + digit);



    }
}
/*
Write a program that can retrieve the letters, digits and special characters from the string

		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */