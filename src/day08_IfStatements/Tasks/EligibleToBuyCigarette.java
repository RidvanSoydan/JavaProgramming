package day08_IfStatements.Tasks;

public class EligibleToBuyCigarette {

    public static void main(String[] args) {

        byte age = 21;

        boolean eligible = age >= 21;

        if (eligible) {
            System.out.println("Eligible to buy ");
        }

        if (!eligible) {
            System.out.println("Not eligible to buy ");

        }
    }
}