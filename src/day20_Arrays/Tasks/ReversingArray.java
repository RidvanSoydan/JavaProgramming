package day20_Arrays.Tasks;

import java.util.Arrays;

public class ReversingArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int [] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed [numbers.length-1-i] = numbers [i];

        }System.out.println(Arrays.toString(reversed));


        System.out.println("------------------------------------------------");


        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        int j = 0;

        for(int i = array.length-1; i >= 0 ; i--){
            reversedArray[j++] = array[i];

        }System.out.println( Arrays.toString(reversedArray) );


    }
}

/*Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */