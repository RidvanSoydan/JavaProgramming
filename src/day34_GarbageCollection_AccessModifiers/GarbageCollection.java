package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors_Overloading_Calls.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args)  {

     //   new GarbageCollection().finalize(); // Every single object has finalize () method

        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() ); // NullPointerException error ==> There is no object
         */

                String str = "Wooden Spoon";
                System.out.println( str );   // Garbage Collector will find and destroy it

                str = null;             // after his line "Wooden Spoon" will be eligible for garbage collection
                System.out.println( str );


                Car car1 = new Car("Toyota");

                car1 = null;

                System.out.println("car1 = " + car1);

                System.out.println("--------------------------------------");

                Dog dog1 = new Dog();
                dog1.name = "Lucy";

                dog1  =     new Dog();
                dog1.name = "Max";

                System.out.println(dog1);

                String language = "Python";
                language    =   "Java"; // "Python" is eligible for garbage collection

                System.out.println(language);

                System.out.println("-----------------------------------");

                ArrayList<Integer> list1 = new ArrayList<>(); // list1 is first door

                list1.add(100);

                ArrayList<Integer> list2 = list1 ;       // list2 is second door

                list2.addAll(Arrays.asList(200, 300, 400));
                                                            // Two ArrayList sharing same objects
                System.out.println(list1); // [100, 200, 300, 400]
                System.out.println(list2); // [100, 200, 300, 400]

                System.out.println(list1 == list2 ); // true
                                                     // both of them referenced not eligible for garbage collection

                System.out.println("-----------------------------------");

                Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
                student1.grade = 'A';

                Student student2 = student1;
                student2.name = "Ahmet";

                System.out.println(student1); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
                System.out.println(student2); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

                System.out.println("------------------------------");

                ArrayList<String> l1 = new ArrayList<>();
                l1.add("Java");

                ArrayList<String> l2 = l1;
                l2.add("Python");


                System.out.println("l1 = " + l1); // l1 = [Java, Python]
                System.out.println("l2 = " + l2); // l2 = [Java, Python]


            }

    }

