package day21_ForEachLoop.FreeTask;

import java.util.Arrays;

public class RotateLeft {

    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        /*
        int temp=x[0];
        //first place = 2
        x[0]=x[1];
        //second place=3
        x[1]=x[2];
        last=1
        x[2]=temp;
         */
        int temp = x[0];
        //2 < 3
        for (int i = 0; i < x.length-1; i++) {
            x[i] = x[i + 1];
        }

        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));




        /*

        Write a program that accepts an array and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]

         */
    }
}
