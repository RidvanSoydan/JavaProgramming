package day15_ForLoop.PracticeTask;

public class SumOfAllNumber {

    public static void main(String[] args) {

        int givenNumber = 50;
        int sum = 0;

        for (int i = 0; i <= givenNumber ; i++) {

            sum +=i;
        }
        System.out.println("Sum of numbers between 1 to " + givenNumber+ " is " + sum);



        /*write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

         */




    }
}
