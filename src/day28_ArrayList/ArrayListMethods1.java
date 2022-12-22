package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        ArrayList <Integer> numbers = new ArrayList<>(); //Empty ArrayList object created...

        System.out.println(numbers);



        // ***** add (data) ==> adds element after the last index *****

        numbers.add(10); // index 0       // 10 is int ==> Autoboxing ==> Integer is converted int implicitly
        numbers.add(20); // index 1       //Size will be adjusted automatically...
        numbers.add(30); // 2
        numbers.add(40); // 3
        System.out.println(numbers);

        System.out.println("-------------------------------------------------------------");


        // ***** add(index, Data) method ==> You can store new data to the index that you want *****
        //                               ==> Inserting element to the specific index
        //                               ==> All elements will be shifted right

        numbers.add(2,25);
        numbers.add(4,35); //index number of 35 will be 4
                                        // original element on the index number 4 will be shifted to the right...
        System.out.println(numbers);

        // numbers.add(6,60);
        //if you give index number does not have the ArrayList ==>  it will give out of bounds error...

        //add methods will increase the size by one, you can call as many as you want...


        System.out.println("-------------------------------------------------------------");


        // ***** size() method = returns the total number of elements in the ArrayList ==> similar to length ()

        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);


        System.out.println("---------------------------------------------------------");


        // ***** get(index) method ==> returns the element at given index as wrapper...

        Integer num = numbers.get(1); // it returns Integer but can be assigned to the int ==> This is unboxing
        System.out.println("num = " + num);

        int num1 = num;  // ==> unboxing
        System.out.println("num1 = " + num1);

        // To be able to get all elements we will use for loop

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------------------------------------");


        // ***** set(index, data) method ==> replaces the element at given index with the new element
        //                               ==> Does not changes the size...
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list);

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("-------------------------------------------------");


       // ***** remove(int index) ==> removes the element at the given index
       //                         ==> Decreases the size by one
       //                         ==> if you give invalid index number you will have out of bounds error...

        ArrayList <String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1); // ali will be removed
        System.out.println(employees);

        employees.remove( employees.size() -1 ); // removes the last element ==> Kaloyan
        System.out.println(employees);


        // ***** remove(Object) ==> removes the given object from ArrayList, returns boolean

        boolean isRemoved = employees.remove("Hulya"); // if the given object is removed then the boolean will be true
        System.out.println(employees);

        boolean isRemoved2 = employees.remove("Neir");
        System.out.println(employees);


        System.out.println("isRemoved = " + isRemoved);
        System.out.println("isRemoved2 = " + isRemoved2);





        }

    }



