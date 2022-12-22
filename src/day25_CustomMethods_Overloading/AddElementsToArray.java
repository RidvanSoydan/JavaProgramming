package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        arr = addInteger(arr,5);

        System.out.println(Arrays.toString(arr));


        System.out.println("------------------------------------------------");


        double [] arr1 = {1.2, 2.3, 3.5, 4.7};

        arr1 = addDouble (arr1,5.0);

        System.out.println(Arrays.toString(arr1));


        System.out.println("------------------------------------------------");


        String [] arr2 = {"javac", "java", "jav"};

        arr2 = addString (arr2, "ja");

        System.out.println(Arrays.toString(arr2));


        System.out.println("------------------------------------------------");

        char [] arr3 = {'j', 'a', 'v'};

        arr3 = addChar (arr3, 'a');

        System.out.println(Arrays.toString(arr3));


    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int [] addInteger (int [] array, int element){

        int [] newArray = new int [array.length + 1];

        int i = 0;
        for (int each : array) {
            newArray [i++] = each;
        }

        newArray [i] = element;

        return newArray;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double [] addDouble (double [] array, double element){

        double [] newArray = new double [array.length + 1];

        int i = 0;
        for (double each : array) {
            newArray [i++] = each;
        }

        newArray [i] = element;

        return newArray;
    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addString (String [] array, String element){

        String [] newArray = new String [array.length + 1];

        int i = 0;
        for (String each : array) {
            newArray [i++] = each;
        }

        newArray [i] = element;

        return newArray;
    }

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char [] addChar (char [] array, char element){

        char [] newArray = new char [array.length + 1];

        int i = 0;
        for (char each : array) {
            newArray [i++] = each;
        }

        newArray [i] = element;

        return newArray;
    }


}








/*

      Task2:

        1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
                                {1,2,3,4}, 5
                                new array ==> {1,2,3,4,5}

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array

 */