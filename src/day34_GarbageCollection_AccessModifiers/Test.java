package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {
                                              //      With static block
        System.out.println(Circle.pi);    // 0.0           3.14
        System.out.println(Circle.name);  // null         Circle
        System.out.println(Circle.numbers); // null      [10,20]

        // if we use main method to initialize static variables it wont run outside the class

        System.out.println("----------------------------");


        // find the sum of 10, 20
        int r1 = sum(10, 20);

        // find the sum of 100, 200
        int r2 = sum(100, 200);

        int r3 = subtract(100,50);

        int r4 = max(1000, 2000);


    }
}
