package day15_ForLoop.PracticeTask;

public class SumOfEvenNumbers {

    public static void main(String[] args) {


        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0){

                sumOfEvenNum += i;

            } else {
                sumOfOddNum += i;
            }

        }System.out.println("sumOfEvenNum = " + sumOfEvenNum);
         System.out.println("sumOfOddNum = " + sumOfOddNum);


       /*Write a program that can return the sum of even numbers between 1 to 100*/


    }


}


