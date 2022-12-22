package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2_CopyOf_CopyOfRange {


    public static void main(String[] args) {

        //copyOf ==> Used for copying the elements of Array
        //           Just used for copying from the BEGINNING TO THE GIVEN INDEX... (0, 4), (0,5)
        //           If given range is bigger than the index of the first Array,
        //           all the elements will be copied and remains will printed as null...

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String [] earlyBirds = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("--------------------------------------------------");


        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));

        numbers = Arrays.copyOf(numbers,5); //1,2,3,4,5

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------------");

        //copyOfRange ==> Used for copying part of Array, Like substring...
        //                First index included, last index not included...

        char [] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        System.out.println(Arrays.toString(ch1));

        char [] ch2 = Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index:         0   1   2   3   4   5   6   7   8  9

        int[] result = Arrays.copyOfRange(scores, 3, 8);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));




    }
}