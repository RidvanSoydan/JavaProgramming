package day29_ArrayList_CollectionsClass;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int max = Collections.max(list); // This method cannot returns second bigger number
        System.out.println("max = " + max); // 8

        list.removeIf(p -> Collections.max(list) == p);
        list.removeIf(p -> Collections.max(list) == p);


        int max1 = Collections.max(list);
        System.out.println("max1 = " + max1); //  3th max number == > 6


        System.out.println("------------------------------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 5;

        for (int i = 1; i < n ; i++){ // this for loop removes max numbers n times
            list1.removeIf(p -> Collections.max(list1) == p);
        }

        int max2 = Collections.max(list1);
        System.out.println("max2 = " + max2); // max2 = 4




    }

}
    /*
        write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			    n = 5
			    output:
				4
    */