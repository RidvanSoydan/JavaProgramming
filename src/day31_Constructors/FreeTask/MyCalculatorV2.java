package day31_Constructors.FreeTask;

public class MyCalculatorV2 {

    public int num1;
    public int num2;
    public MyCalculatorV2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int  plus () {
        return num1 + num2;
    }
    public int minus () {
        return num1 - num2;
    }
    public int multiply () {
        return num1 * num2;
    }
    public int divide () {
        return num1 / num2;
    }
    public String toString() {
        return "MyCalculator2{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

}
