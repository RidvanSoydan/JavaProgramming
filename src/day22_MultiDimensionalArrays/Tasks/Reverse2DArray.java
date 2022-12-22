package day22_MultiDimensionalArrays.Tasks;

import java.util.Arrays;

public class Reverse2DArray {


    public static void main(String[] args) {

        int [][]  array = { {1,2,3}, {4,5,6}};
                      //       0        1
        int [][] reversedArray = new int[array.length][array[1].length];

        for (int i = array.length - 1; i >= 0; i--) { //taking each element of multi dimensional array
                //         2 - 1 = 1 ==> i = 1
            for (int j = array[i].length - 1; j >= 0; j--) { // taking each element of single dimensional array
                        //     3-1 = 2 == > j = 2
                reversedArray [array.length-1-i][array[i].length-1-j] = array[i][j];
                  //             2 - 1 - i(1)=0        3-1-j(2)=0     //      1  2
                  //
            }

        }
        System.out.println(Arrays.deepToString(reversedArray));


        System.out.println("-------------------------------------------------------------");

        int[][] arr = { {1,2,3}, {4,5,6,7}};

        int[][] reverse = new int[arr.length][];


        for (int i = arr.length - 1, k = 0; i >= 0; i--, k++) {
//                     i = 2-1 = 1
            reverse[k] = new int[arr[i].length];
           //       0                 4

            for (int j = arr[i].length - 1, l = 0; j >= 0; j--,l++) {
//                  j = 4-1 = 3
                reverse[k][l] = arr[i][j];
//                      0  0        1  3
            }
        }
        System.out.println(Arrays.deepToString(reverse));

        /*Write a program that can reverse a two dimensional array (return new array)

		    Ex:
			array = { {1,2,3}, {4,5,6}};

		    output:
			reverse = { {6,5,4}, {3,2,1},};  */



    }
}
