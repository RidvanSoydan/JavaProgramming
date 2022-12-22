package day05_Concatenation;

public class Variables_Practice {

// declaring variables """datatype variablename = data"""
    public static void main (String [] args) {  /* 1. create a class called Varibales_Practice & declear the following variables:
                                                num1 = 100;
                                                num2 = 10000;
                                                num3 = 3.5;
                                                num4 = 2.5f;
                                                num5 = 999999999999L;
                                                num6 = 850000;

                                                print each of the variables above on the console */

    byte num1 = 100;
    int num2 = 10000;
    double num3 = 3.5;
    float num4 = 2.5F;
    long num5 = 999_999_999_999L; // if you have very huge number you can use long
    int num6 = 85000;    // if the number is the out of ints range it will give compile error, so you will force java to take this as long by using L or l at the end of the number



    /* "123" is not same with 123
        "123" is text, 123 is number
        "123" + 1 = "1231" this is concatenation
        123 + 1 = 124 this is calculation, addition
     */

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);









    }






}
