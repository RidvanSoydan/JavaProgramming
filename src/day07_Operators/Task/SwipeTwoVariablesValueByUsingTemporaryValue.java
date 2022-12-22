package day07_Operators.Task;

public class SwipeTwoVariablesValueByUsingTemporaryValue {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a;

        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }

}

/*
1. write a program that can swipe two variables' value by using a
temporary variable
    Ex:
        if a= 10, b=15
    output:
        a = 15
        b = 10
 */

