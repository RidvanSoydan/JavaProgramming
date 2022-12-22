package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates_ArrayList_Contains {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        System.out.println("list = " + list);

        ArrayList<Integer> removedDuplicates = new ArrayList<>(); //{10, 20, 30}


        for (Integer each : list) {

            if (!removedDuplicates.contains(each)){

                /*or
            if (removedDuplicates.contains(each)){
                continue;
            */
                removedDuplicates.add(each);
            }


        }

        System.out.println("Removed Duplicates = " + removedDuplicates);



    }
}
