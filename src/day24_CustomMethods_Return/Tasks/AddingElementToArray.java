package day24_CustomMethods_Return.Tasks;

import java.util.Arrays;

public class AddingElementToArray {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        int element = 6;

        System.out.println(Arrays.toString(arr));

        int [] finalArray = addingElementToArray(arr, element);

        System.out.println(Arrays.toString(finalArray));

    }


    public static int[] addingElementToArray (int[] array, int element){

        int[] newArray = new int [array.length + 1];

        int i = 0;

        for (int each : array) {
            newArray [i] = each;
            i++;
        }

        newArray [array.length] = element;

        return newArray;
    }

}
/*
        create a method named addElement that takes one integer array and one integer,
        the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */