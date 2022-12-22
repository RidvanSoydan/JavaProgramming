package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {


    public double radius;     // instance ==> Each object has its own copy, we use constructors to set instances
    public static double pi;  // static ==> Common values
    public static String name;

    public static ArrayList<Integer> numbers;


    //public static Sheet sheet ;

    public Circle(double radius) {
        this.radius = radius;   //Constructor depends on object, without object it will never get executed
        //  pi = 3.14;          // Constructor accepts static members but it gets executed multiple times
    }


    static {                // if setting static variables takes more than one step, we must use static block
        // radius = 5;      // Static members mend to initialize outside the class so we have use static block
        pi = 3.14;          // With Main method we can set the static members but we cant use outside the class
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


/*
    public static void main(String[] args) {  // Main method is static, static accepts the statics
                                        // Main method accepts the static variables but we cant use outside the class
        pi = 3.14;                      //Main method only runs in this Circle class
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }
*/

}