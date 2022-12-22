package day09_IfStatements;

public class EligibleToBuyAlcohol_IfElse {

    public static void main (String [] args) {

    // task : Write a program that can check if the person is eligible to buy alcohol

    int age = 17;
    String name = "Simpson";

    if(age >=21){

        System.out.println(name + " is eligible to buy alcohol");
    } else {
        System.out.println(name + " is NOT eligible to buy alcohol");
    }

}
}
