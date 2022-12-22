package day23_CustomMethods_Void.Tasks;

public class KgToPound {

    public static void main(String[] args) {

        kgToPound (10);

    }

    public static void kgToPound(double kg){

        double pound = kg * 2.205;
        System.out.println(kg + " kg equal to " + pound + " pounds");

    }

}
//create a method that can convert kg to pound (lb)