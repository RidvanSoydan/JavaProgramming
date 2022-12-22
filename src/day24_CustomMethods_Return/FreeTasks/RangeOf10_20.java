package day24_CustomMethods_Return.FreeTasks;

public class RangeOf10_20 {

    public static void main(String[] args) {

        rangeOf10_20OrNot(8,99);

        System.out.println("--------------------------------------");

        rangeOf10_20OrNot(10,25);

    }

    public static boolean rangeOf10_20OrNot (int num1, int num2){

        boolean isInTheRange = false;

        if (num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20 )
            isInTheRange = true;

        else
            isInTheRange = isInTheRange;

        System.out.println("One of the " + num1 + " and " + num2 + " are in the range of 10 ~ 20 ==> " + isInTheRange);
        return isInTheRange;
    }

    /*
            Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
     */
}
