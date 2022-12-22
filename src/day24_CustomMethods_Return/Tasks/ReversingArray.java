package day24_CustomMethods_Return.Tasks;

import java.util.Arrays;

public class ReversingArray {

    public static void main(String[] args) {


        String [] array = {"Ben", "Sen", "O"};
        System.out.println(Arrays.toString(array));

        System.out.println("---After reversed---");

        String [] reversed = reversingArray(array);
        System.out.println(Arrays.toString(reversed));

    }


    public static String [] reversingArray (String [] array){

        String [] reversed = new String [array.length];

        int j = 0;

        for (int i = array.length-1; i >= 0 ; i--) {

            reversed [j] = array[i];
            j++;
        }

        return reversed;
    }

}
/*
        Create method named reverse that passes an integer array parameter,
	    the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */