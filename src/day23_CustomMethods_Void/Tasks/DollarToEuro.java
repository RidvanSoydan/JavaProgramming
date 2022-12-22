package day23_CustomMethods_Void.Tasks;

public class DollarToEuro {

    public static void main(String[] args) {

        dollarToEuro(100);

    }

    public static void dollarToEuro(double dollarAmount){
        double euro = dollarAmount * 1.22;
        System.out.println(dollarAmount + " Dollar equal to " + euro + " Euro");
    }
}
//create a method that can can convert dollar to lira