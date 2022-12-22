package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyEachOddElementBy2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 5]

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {

            if (each % 2 != 0){
                newList.add(each*2);
            }else {
                newList.add(each);
            }
        }

        System.out.println("newList = " + newList); //newList = [2, 2, 6, 4, 10]

    //ANOTHER WAY

        /*
         for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0){
                list.set(i, list.get(i)*2 );
            }
        }

         */




    }






}
/*

3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 */