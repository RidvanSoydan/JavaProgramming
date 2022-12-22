package day27_WrapperClasses.Tasks;

import java.util.Arrays;

public class BubbleSort_OurSort {

    public static void main(String[] args) {

        int[] list = {1, 3, 2, 4, 1, 5};

        System.out.println(Arrays.toString(bubbleSort(list)));

    }

    public static int[] bubbleSort (int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
