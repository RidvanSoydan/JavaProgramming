package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<Integer>() ;
                //if you choose Integer as data type that means you can store only Integers inside the ArrayList
        ArrayList <String> names = new ArrayList<>();

        System.out.println(numbers); //You don't have to call to.String() method in order to print ArrayList,
                                     // it will get executed automatically because ArrayList class has to.String() method
        System.out.println(names.toString()); //if you want you can call also...

            //Size is zero in these ArrayLists...




    }
}
