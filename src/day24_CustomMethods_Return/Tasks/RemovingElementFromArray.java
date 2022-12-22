package day24_CustomMethods_Return.Tasks;

import java.util.Arrays;

public class RemovingElementFromArray {

    public static void main(String[] args) {

        int [] array = {10, 20, 3, 30, 40, 50};
        System.out.println(Arrays.toString(array));
        int indexNum = 2;

        System.out.println("------------After Removed-------------------");

        int [] finalArray = removingElementFromArray(array, indexNum);
        System.out.println(Arrays.toString(finalArray));
    }


    public static int [] removingElementFromArray (int[] array, int indexNum){

        int [] finalArray = new int [array.length-1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == indexNum)
                continue;
            finalArray[j++] = array[i];

        }
            return finalArray;
    }



}

/*
        create a method named removeElement that passes one integer array and one integer,
	    the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */