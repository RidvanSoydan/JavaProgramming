package day23_CustomMethods_Void.Tasks;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        posNegZero(-10);
    }

    public static void posNegZero(int number){

        String result = (number > 0) ? "Positive" :(number < 0) ? "Negative" : "Zero";
        System.out.println(result);

    }

}
