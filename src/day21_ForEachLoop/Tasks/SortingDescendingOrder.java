package day21_ForEachLoop.Tasks;

import java.util.Arrays;

public class SortingDescendingOrder {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));


        /*
        Write a program that sort the array of integer in descending order
         */

    }
    }





