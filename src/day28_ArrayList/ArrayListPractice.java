package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list); // [1, 2, 3, 4, 5, 6]

        for (int i = 0; i < list.size(); i++) { //i : index numbers of list

            list.set(i,list.get(i)*2);
        }

        System.out.println(list); // [2, 4, 6, 8, 10, 12]

    }
}
/* Multiply all elements by 2

{1,2,3,4,5,6}
{2,4,6,8,10,12}

 */