package day10_NestedIf.Homework;

public class BiggerNumber {

    public static void main(String[] args) {

        int n1 =15;
        int n2 =5;
        int n3 =3;
        String result = "";

        result = (n1 > n2 && n1 > n3) ? n1 + " is bigger than " + n2 + " and " + n3
                : (n2 > n3) ? n2 + " is bigger than " + n1 + " and " + n3
                : n3 + " is bigger than " + n1 + " and " + n2;

        System.out.println(result);

    }

    /* Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY


     */
}
