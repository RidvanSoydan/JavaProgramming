package day31_Constructors.FreeTask;

public class MyCalculatorV2Test {

    public static void main(String[] args) {

        MyCalculatorV2 myCal2 = new MyCalculatorV2(12,4);

        System.out.println(myCal2.plus());
        System.out.println(myCal2.minus());
        System.out.println(myCal2.multiply());
        System.out.println(myCal2.divide());
    }

}
