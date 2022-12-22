package day23_CustomMethods_Void.Tasks;

public class DollarToLira {

    public static void main(String[] args) {

        dollarToLira(25);
    }

    public static void dollarToLira(double dollarAmount){

        double lira = dollarAmount * 18.55;
        System.out.println(dollarAmount + " dollar equal to " + lira + " lira");
    }

}
