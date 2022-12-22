package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class MergeTwoArrayIntoArrayList {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> newList = new ArrayList<>();

        for (String each : arr1) {
            newList.add(each);
        }

        for (String each : arr2) {
            newList.add(each);
        }

        System.out.println("newList = " + newList); //newList = [A, B, C, D, E, F, G]

    }

}


/*
 write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}


 */