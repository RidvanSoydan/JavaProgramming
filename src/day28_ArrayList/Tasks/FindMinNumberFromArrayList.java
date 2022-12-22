package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinNumberFromArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,2,5,1,3));

        int min = list.get(0);
        System.out.println("min = " + min); // 3

        for (Integer each : list) {

            if (each < min){
                min = each;
            }

        }
        System.out.println("min = " + min); // 1

    }

}
