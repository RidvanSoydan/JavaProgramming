package day27_WrapperClasses.Tasks;

import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};

        arr = swapElement(arr, 0,1);

        System.out.println(Arrays.toString(arr));

    }


    public static int [] swapElement (int [] array, int index1, int index2){

       int temp = array [index1];

       array [index1] = array [index2];

       array [index2] = temp;

        return array;
    }




}

/*
Swap Task:

	2.1 Create a method named swap that passes three parameters:
	integer array, integer i, integer j. the method swaps the element at index i with the element at index j,
	and returns the new array

			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */