package day22_MultiDimensionalArrays.Tasks;

import java.util.Arrays;

public class BiggestNumberIn2DArray {

    public static void main(String[] args) {

        int [] arr1 = {5, 340, 221, 566, -20, 75};
        int [] arr2 = {4, 134, 4341, -416, -110, 900, 1215};
        int [] arr3 = {9, 13500, 45, 602, -10, 19220, 12015};


        int [][] arr2D = { arr1, arr2, arr3 };

        int [] biggestNumbers = new int[arr2D.length]; // 3


        for(int i=0; i < arr2D.length ; i++){

            int max = arr2D[i][0]; // assuming that first element of the each 1D arrays is biggest number

            for (int each : arr2D[i]){
                if (each > max) {
                    max = each;
                }
            }
            biggestNumbers[i] = max;
        }

        System.out.println(Arrays.toString (biggestNumbers));
    }
}
