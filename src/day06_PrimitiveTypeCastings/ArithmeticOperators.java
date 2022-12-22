package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /*
            +  ADDITION + Adds one value to another 10+5 15
            - SUBTRACTION Subtracts one value from
            / DIVISION / Divides two values 10/5 2
                        integer / integer == integer
                        decimal / integer == decimal
                        integer / decimal == decimal
                        decimal / decimal == decimal

            * MULTIPLICATION * Multiplies two values 10*5 50
            % MODULUS Divides two values and returns the remainder 10%3 = 1

         */

        System.out.println(10 + 20); //result 30
        System.out.println("12" + 1); //result 121 ... this is concatenation  "12" is text not number
        System.out.println(100 - 50); //result 50


        // in math  10/4 =2.5
        // in java 10/4 = 2   Because "10" and "4" are both integer and the result also will be integer
        // if you want to take decimal (2.5) result one of the numbers must be decimal so you have to write 10.0 not 10

        System.out.println(100 / 3); // result 33    // 100 is numarator (BÖLÜNEN), 3 is denominator (BÖLEN) in java
        System.out.println(100.0 / 3); // result 33.3...
        System.out.println(100 / 3.0); // result 33.3...
        //another ways
        System.out.println(10d/3); //lower case d or upper case D: if you write after numbers it will give also decimal result
        System.out.println((double)100 /3);// result 33.3... but this not the preferred way.

        //====

        int a = 100;
        double b = a/6; //16 ==== 16 is assigned to double so it will be 16.0 in console
        System.out.println(b);
        int k = a/6;
        System.out.println("k : " + k); // result k : 16
        //if I want to take 16.66 result what can I do;
        double c = a/6.0;
        System.out.println(c); // result 16.66..

        double e = a/6d;
        System.out.println(e); // result 16.66..

        double f = (double)a/6;
        System.out.println(f); // result 16.66..







    }





}
