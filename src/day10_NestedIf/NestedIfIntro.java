package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;             //pre condition is score MUST BE valid
            // if the score is invalid those two conditions you should be never considering them
            // so you need nested if condition
            //I moved two of if conditions inside the curly braces of nested if which is pre condition


        if (score >=0 && score <= 100) { //If the score is Valid

            if(score >= 60) { // if the student passed
                System.out.println("Passed");
            } else { // if the student failed
                System.out.println("Failed");
            }
            // if pre condition is failed those two conditions wont be checked by compiler
            /*So if I have other condition if pre condition is failed, I need to use ELSE (opposite of if),
             after the closing curly braces of the pre condition if statement
             */

        } else {                    //If the score is INVALİD
            System.out.println("Invalid Score");
        }

        //Outer and Inner If statements can be any type of if statement (Single if, If…else and Multi-branch If)

        System.out.println("--------------------------------------------");

        int age = 25;
        boolean hasID = false;

        if (hasID) { // if the person has ID

            if (age >= 21) { //if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is less than 21 years old
                System.out.println("Not Eligible to buy alcohol");
            }

        } else { // if the person does not have ID
            System.out.println("You MUST have ID to buy alcohol");
        }


        System.out.println("--------------------------------------");

        // Name Of The Day

        int number = 6;

        if (number >= 1 && number <= 7){ //if the number is valid number (1~7) ////This is NESTED IF
            // you cannot write like in the math "1 <= number <=7"
            //We have 7 possible outputs. We will use multi branch if

            if (number == 1){
                System.out.println("Monday");
            }else if (number == 2){
                System.out.println("Tuesday");
            } else if (number ==3 ){
                System.out.println("Wednesday");
            }else if (number == 4){
                System.out.println("Thursday");
            }else if (number == 5){
                System.out.println("Friday");
            }else if (number == 6){
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }

        }else { //if the number is NOT VALID
            System.out.println("Invalid Number");
        }


    }
}
