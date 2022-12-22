package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) { // Brackets in this line means Arrays

        //Single dimensional array...

        // ***create a variable that's capable enough to contains 5 names

                            //You can use [] after the Data Type or After the Variable Name
                            // Brackets represents number of the dimensions of the Array
                            // If we use two [] ((like String [] myGroup [])) it means multi dimensional Array...

        String [] myGroup2 = new String[5];  //You must give same data type before and after the assigment operator (=)
                                //size of Array is 5    //setting the size of Array
                                //It can contain 5 elements...

        //  System.out.println(myGroup); // if you print Array with just variable name (myGroup), it will print hash code (@511baa65)

        // The way of printing Arrays...I need to import Arrays.java.util...

        System.out.println(Arrays.toString(myGroup2) ); // [null, null, null, null, null]==>
                                                       // null keyword is Default value of all the non-primitives
                                                       // it means no objects were given to the Array



        int [] myGroup3 = new int[5];
        System.out.println(Arrays.toString(myGroup3)); // [0, 0, 0, 0, 0]
                                                       // 0 is default value of byte, short, int, long ===> 0
                                                       // 0.0 is ==> float, double
                                                       // boolean ==> false


        String [] myGroup = new String[5]; // index number 0 ~ 4

        myGroup [0] = "Gunay";
        myGroup [1] = "Neira";
        myGroup [2] = "Suat";
        myGroup [3]= "Hulya";
        myGroup [4] = "Mikael";
   //   myGroup [5] = "Muhtar"; //ArrayIndexOutOfBoundsException error, Array size is fixed,
                                //if the Array size is 5, you cannot store 6 elements in this Array...
                                //You cannot reduce or increase the size of Array...
  //    myGroup [-1] = "Adam" ==> It will give error too, smallest index number in the java is 0...

        System.out.println(Arrays.toString(myGroup));

        // Arrat Initialization

        int [] myList = {1,2,3,4,5}; // if you know how many elements and what elements you will store in Array
                                     // You can initialize like this way ....
        System.out.println(Arrays.toString(myList));

        System.out.println("-------------------------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //Index:            0           1           2           3           4          5          6
        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number < 1 || number > 7) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]); // Friday
                                            // If you try to Access the specific element of Array
                                            // You don't need to use Array.toString()...


    }

}
