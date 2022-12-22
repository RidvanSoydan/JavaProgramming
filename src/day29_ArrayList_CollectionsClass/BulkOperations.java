package day29_ArrayList_CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        // addAll (), removeAll (), retainAll (), containsAll () methods
        // used with Arrays.asList (data)...

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll (Arrays.asList (1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8, 8, 8, 9, 10) );

        System.out.println("list = " + list); //list = [1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8, 8, 8, 9, 10]


        System.out.println("-----------------------------------------------------");



        list.removeAll(Arrays.asList(3, 5, 8)); //if there is more one 3, 5 or 8, all of them will be removed
                                                // in removeAll () method you specify elements not indexes
        System.out.println("list = " + list); //list = [1, 2, 4, 6, 7, 9, 10]


        System.out.println("--------------------------------------------------------");



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll( Arrays.asList (100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900) );

        numbers.retainAll(Arrays.asList(100, 200, 300)); //elements that you want to keep inside the ArrayList

        System.out.println("numbers = " + numbers); //numbers = [100, 200, 300, 100, 200, 300]


        System.out.println("------------------------------------------------------------");


        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println(jobTitles); //[QA, SDET, QA, SDET]


        System.out.println("------------------------------------------------------------------");


        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll ( Arrays.asList (1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll( Arrays.asList(2, 5, 10, 1000) ); //if one them is not contained, it return false

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------------------------------------------------");


        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList <String> namesList = new ArrayList <> (Arrays.asList (names) );

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList); // [Josh, Jack, Daniel, Shay, Breanna]


        System.out.println("------------------------------------------------------------------");


        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);


        System.out.println("-----------------------------------------------------");


        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList <Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) ); // We made our method to convert
                                                                                      // int array to the ArrayList
        System.out.println("list3 = " + list3);

    }

        // converts the given int array to the ArrayList
        public static ArrayList <Integer>  convertArrayToArrayList ( int[] array){

            ArrayList <Integer> list = new ArrayList<>();

            for (int each : array) {
                list.add (each);
            }

            return list;
        }


}

