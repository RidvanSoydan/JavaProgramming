package day15_ForLoop.PracticeTask;

public class SumOfOddNumbers {

    public static void main(String[] args) {


        int sumOfOddNums =0;

        for (int i = 0; i <=100 ; i++) {
            
            if (i % 2 != 0) {
                
                sumOfOddNums = sumOfOddNums + i;
            }

        }
        System.out.println("sumOfOddNums = " + sumOfOddNums);
        
        
        /*
        Write a program that can return the sum of odd numbers between 1 to 100
         */

    }


}


