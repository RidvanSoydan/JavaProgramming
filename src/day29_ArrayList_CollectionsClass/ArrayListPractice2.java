package day29_ArrayList_CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));


        employees.retainAll(Arrays.asList("Ahmed", "David")); // will remove unmatching elements

        System.out.println("employees = " + employees); // employees = [David, Ahmed, Ahmed, David]


        System.out.println("---------------------------------------------------------------------------");


        String[] names = {"Mary", "Monica", "Mehray", "musti", "Sumeyra", "Hasan", "Beril"};
        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );


        list.removeIf(p -> p.charAt(0) == 'M' || p.charAt(0) == 'm' ); // removing names starts with M or m;
        System.out.println("list = " + list); // list = [Sumeyra, Hasan, Beril]


        names = list.toArray(new String[0]); // converting ArrayList to Array...
        System.out.println(Arrays.toString(names)); // [Sumeyra, Hasan, Beril]





    }
}
