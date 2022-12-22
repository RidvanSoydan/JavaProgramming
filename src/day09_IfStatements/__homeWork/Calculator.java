package day09_IfStatements.__homeWork;

import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {

        /*Create a class called Calculator, Given two double variables named n1
        & n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
         */

        double num1, num2;
        num1 = 6;
        num2 = 6;
        char mathOperator = '/';

        if (mathOperator == '+') {
            System.out.println(num1 + num2);

        } else if (mathOperator == '-') {
            System.out.println(num1 - num2);

        } else if (mathOperator == '*') {
            System.out.println(num1 * num2);

        } else if (mathOperator == '/') {
            System.out.println(num1/num2);

        } else {
            System.out.println("Invalid operator");
        }




    }
}
