package day23_CustomMethods_Void.Tasks;

public class EligibleBuyAlcohol {

    //create a method that can check if a person is eligible to buy alcohol

    public static void main(String[] args) {

        eligible(21);
    }


    public static void eligible (int age) {

        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligibleto buy alcohol");
        }
    }





}