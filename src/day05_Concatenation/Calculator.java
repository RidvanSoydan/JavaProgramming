package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {


        int firstnumber = 100;
        int secondnumber = 50;

        int addition = firstnumber + secondnumber;
        int substraction = firstnumber - secondnumber;
        int multiplication = firstnumber * secondnumber;


        // 100 + 50 = 150

        System.out.println(firstnumber + " + " + secondnumber + " = " + (100 + 50)); // Result çıkması için parantez içinde yazılır
        System.out.println(firstnumber + " + " + secondnumber + " = " + (firstnumber + secondnumber));
        System.out.println(firstnumber + " + " + secondnumber + " = " + (addition));


        // 100 - 50 = 150

        System.out.println(firstnumber + " - " + secondnumber + " = " + (substraction));

        // 100 * 50 = 5000


        System.out.println(firstnumber + " * " + secondnumber + " = " + (multiplication));



    }



}
