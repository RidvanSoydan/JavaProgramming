package day06_PrimitiveTypeCastings;

public class A_PrimitiveCastings {

    public static void main(String[] args) {

        //smaller primitives can be directly assigned to larger primitive type
        //larger primitives can NOT be directly assigned to smaller primitive types (need to be casted manually)

        //double > float > long > int > short > byte

    byte a = 100;
    short b = a; //implicit casting

        // short b = (short)a
        //           (short)a
        int c = b; //implicit casting
        //int c = (int)b   compiler makes this "(int)" automatically, happening in the background
        // THIS IS IMPLICIT, KÜÇÜĞÜ BÜYÜĞE
        long d = c;
        //      (long)c;
        float e = d;
        double f  =e;

        System.out.println("----------------");

        int x = 55;
        //short y = x;    compile error
        short y = (short) x; // explicit casting you must do it manually everytime

        System.out.println(x + " : " + y);

        long j = 1000000;
        //short k = j; compile error
        short k = (short) j;
        // if the number is outside the range out variables it will give different number in console,,,

        System.out.println(j + ":"+ k); //1000000 is out of the range of short so when you click run, it gave 16960 in console.

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " + m); //both of them 2.5

        // Expliciting Both integers and decimals

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : " +s); // in the integer numbers 10.8 is equal to 10, not 11. It won't round it to 11.

        // Easier way in explicit castings ALT + ENTER, you see " cast to "short" "
        // Another way if you dont like shortcut buttons when you click redline on the left side you will see solution button.

        double d1 = 20.5;
        short s1 = (short) d1; //it will give s1 as 20 in console because short accept only integers.

        System.out.println(d1 + " : " + s1);
        ///

        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1); //it will give s1 as 30 in console because long accept only integers.





    }



}
