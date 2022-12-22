package day29_ArrayList_CollectionsClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        /*for (int i = 0; i < list.size(); i++) { // we cannot use remove () method in for loop...
            if(list.get(i) %2 != 0 ){           // Index number is changing so remove method cannot remove properly
                list.remove(i);
            }  //[2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8] ==> 1 is remaining
        }*/

        System.out.println(list);

        System.out.println("---------------------------------------------------------------------");


        // I want to remove all elements less than 5;

        list.removeIf ( p ->  p < 5 ); // -> Lambda Expression... (interfaces of collection, iterable etc)
                                       // variable p is representing every single element of Arraylist

        System.out.println(list); // [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]


        System.out.println("---------------------------------------------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list2.removeIf( each -> each % 2 == 0);

        System.out.println("list2 = " + list2); //list2 = [1, 3, 5, 7, 9]


        System.out.println("------------------------------------------------------------------------");


        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "java", "Java"));

        list3.removeIf( p -> p.startsWith("J") || p.startsWith("j"));

        System.out.println("list3 = " + list3); //list3 = [Python, C#, C++]


        System.out.println("------------------------------------------------------------------------");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));


        names.removeIf( name -> !StringUtility.isPalindrome(name)); // Remove not palindrome ones
        System.out.println("names = " + names); // names = [Anna, Racecar, Level, Eye]


        names.removeIf( name -> StringUtility.isPalindrome(name)); // Remove palindrome ones
        System.out.println("names = " + names); // names = []


    }
}
