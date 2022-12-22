package day20_Arrays.Tasks;

import java.util.Arrays;

public class PeakElement {

    public static void main(String[] args) {

        int [] array ={1,3,5,4,7,8,6};


        for (int i = 1; i < array.length-1; i++) {

            if (array[i] > array[i-1] && array[i] > array[i+1]) {

                System.out.print (array[i] + " ");
            }

        }
/*
        Can you find the peak number of an integer array?
        Peak Number: the element number is gonna be higher than its neighbours?

 */
    }
}
