package day29_ArrayList_CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);

        ArrayList<Integer> unique = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)){
                    count++;
                }
            }
            if (count == 1){
                unique.add(list.get(i));
                break;
            }
        }

        System.out.println("Unique = " + unique);


        System.out.println("----------------------------Another Way---------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);

        System.out.println(list1);

        for (Integer each : list1) {

            int frequency = 0;
            for (Integer element : list1) {
                if(element == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(each);
                break;
            }
        }


    }
}

/*
 Write a program that can return the first unique elements from an arraylist
        Do not use indexOf & lastIndexOf methods
 */
