package day29_ArrayList_CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        // converting array to arraylist:
        ArrayList<String> list = new ArrayList<>( Arrays.asList(countries) );

        System.out.println("list = " + list); // list = [Japan, Korea, United States, Turkey, United Kingdom, Canada]


        list.removeIf(p -> p.length() >= 10); // p is representing each element of ArrayList
        System.out.println("list = " + list); // list = [Japan, Korea, Turkey, Canada]


        // converting ArrayList to Array ==> Second way is for loop

        countries = list.toArray(new String[0]);//size of Array depends on ArrayList size ==> 0,1,2  is not important
                                                // if you write bigger number then the size of Arraylist,
                                                // it will print null keywords after the size of ArrayList

        System.out.println(Arrays.toString (countries)); //[Japan, Korea, Turkey, Canada]





    }
}
        /*
            create an Array of string called countries
            write a program that can remove all the country names that have length of 10 or greater
        */