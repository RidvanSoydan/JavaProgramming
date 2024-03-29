package day23_CustomMethods_Void.Tasks;

public class Calculator {

    public static void main(String[] args) {

        calculate(5.0, 2.0, '/');
    }

    public static void calculate(double num1, double num2, char operator) {

        String result = "Invalid";

        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {

            if (operator == '-') {
                result = "Subtraction: " + (num1 - num2);
            } else if (operator == '+') {
                result = "Addition: " + (num1 + num2);
            } else if (operator == '*') {
                result = "Multiplication: " + (num1 * num2);
            } else {
                result = "Division: " + (num1 / num2);
            }

        }

        System.out.println(result);
    }


}

//create a method named calculator that passes three arguments
// (num1, num2, mathOperator), prints the calculation result