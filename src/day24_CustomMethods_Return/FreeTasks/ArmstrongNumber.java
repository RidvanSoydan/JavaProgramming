package day24_CustomMethods_Return.FreeTasks;

public class ArmstrongNumber {

    public static void main(String[] args) {

        boolean result = armstrongNumber (371);
        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

        boolean result1 = isArmstrong(371);
        System.out.println(result1);

        /*int num = 10;

        String str  = "" + num;

        int number1 = str.charAt(1); // '0' ==> 48
        System.out.println("number1 = " + number1);

        char ch1 = 49; // What is on Ascii tables 49. place? ==> 1
        System.out.println("ch1 = " + ch1);

        int number2 = '0';
        System.out.println("number2 = " + number2);*/

    }

    public static boolean armstrongNumber (int number){

        boolean armstrongNumOrNot = false;

        String str = "" + number; // 371 ==> "371"

        int num1 = str.charAt(0) - 48; // str.charAt (0) = 3 ==> 51 ==> 51 - 48 = 3
        int num2 = str.charAt(1) - 48;
        int num3 = str.charAt(2) - 48;

        if((num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3) == number)
            armstrongNumOrNot=true;


        return armstrongNumOrNot;

    }

    public static boolean isArmstrong (int number){

        boolean armstrong = false; //  if the logic is true the variable will become true

        int lastDigit = 0; //371
        int newNumber = 0;
        int originalNumber = number;  // We will do some actions on number so we must store the number at another variable

        while (number > 0){

            lastDigit = number % 10;  // to find the last digit //7 - 1
            number = number / 10;  // to get remaining number //31 - 3

            newNumber += (lastDigit*lastDigit*lastDigit); // 7*7*7 + 1*1*1 + 3*3*3 = 317
        }

        if(newNumber == originalNumber){
            armstrong = true;
        }

        return armstrong;
    }


}

    /*
    Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three
                and added to obtain a number. If the number obtained equals the original number then,
                we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
     */

