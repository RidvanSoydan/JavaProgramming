package day24_CustomMethods_Return.Tasks;

import java.util.Arrays;

public class MergingTwoArrays {

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,5,4,3,2,1};

        int [] finalArray = mergedArray (array1, array2);

        System.out.println(Arrays.toString(finalArray));

    }

    public static  int[] mergedArray (int[] arr1, int[] arr2){

        int [] finalArray = new int [arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
        finalArray[i++] += each;
        }

        for (int each : arr2) {
            finalArray[i++] += each;
        }

        return finalArray;
    }



}
/*
        Create a method named merge that passes two integer array parameters,
	    the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */