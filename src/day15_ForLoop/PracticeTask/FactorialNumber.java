package day15_ForLoop.PracticeTask;

public class FactorialNumber {

    public static void main(String[] args) {


        int givenNumber = 15;
        long factorialNumber =1;

        for (int i = 1; i <= givenNumber; i++) {

            factorialNumber *= i;

        }
        System.out.println("Factorial number of " + givenNumber + " = " + factorialNumber);

        /*4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

         */
    }
}
