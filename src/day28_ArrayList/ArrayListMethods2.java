package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // return () methods continue ...

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        int num = 0;
        list.remove(num); // num is primitive int ==> so element on the index 1 will be removed


        Integer num1 = 200; // num1 is Integer ==> Object ==> Not primitive
        list.remove(num1);  //The first 200 object will be removed
        System.out.println(list);

        boolean r = list.remove(num1); //The first 200 object will be removed then it will return true
        System.out.println(list);

        System.out.println(r);
        System.out.println("------------------------------------------------------");

        // ***** clear() method ==> Remove all the elements of the arraylist
        //                      ==> Size will be 0


        System.out.println("Size is : " + list.size());

        list.clear();

        System.out.println("Size is : " + list.size());
        System.out.println("list : " + list);

        System.out.println("-------------------------------------------------------");


        //	***** indexOf(Data)       : returns the first matching element's index number, returns int
        //	***** lastIndexOf(Data)   : returns the last matching element's index number, returns int

        ArrayList <Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A'); // 4

        System.out.println("Index of 'A' : " + a);
        System.out.println("Last index of 'A' : " + b);

        System.out.println("--------------------------------------------");


        // ***** contains(Data)method ==> checks if the specific element is contained in the arraylist returns true,
        //                            ==> if not contains returns false

        boolean r2 =  characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------------------------");


        // ***** equals(ArrayList)  ==> returns true if two arraylists are equal (same elements in same order),
        //                          ==> otherwise returns false

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // False ==> Two different objects created in heap, so they aren't same thing
        System.out.println(list1.equals(list2)); // equals method looks the concept ==> they have same elements

        System.out.println("----------------------------------------------------------------");

        // ***** isEmpty  ==> returns true if the size of arraylist is 0, if not returns false...

        boolean r4 = list1.isEmpty(); //false
        System.out.println("r4 = " + r4);

        list1.clear();
        boolean r5 =  list1.isEmpty(); // true

        System.out.println("r4 = " + r4);

        System.out.println("------------------------------------------------------");

        // Bulk Operations  :
        //          containsAll() ==> Allows to check multiple elements contained or not in the ArrayList
        //          addAll(),     ==> Allows to add multiple elements to the ArrayList
        //          removeAll()   ==> Allows to remove multiple elements from ArrayList, removes matching ones
        //          retainAll()   ==> Allows to remove multiple elements from ArrayList, removes unmatching ones

        //              In order to use these methods we need to use asList() method from Arrays Utility class.

        //Bulk Operation: Collection Type
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("numbers = " + numbers);

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("numbers = " + numbers);











    }
}
