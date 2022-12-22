package day09_IfStatements;

public class C_PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        boolean positive = n > 0;
        boolean negative = n < 0; //!positive && n != 0;
        boolean zero = n == 0; //!positive && !negative

        if (n > 0) {
            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }
        System.out.println("----------------------------------------- \n N0 NEED TO DO LIKE ABOVE");


        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else { // no need to write else (n == 0), if firts and second condition is false automatically else get executed
            // when you use else block it means if statement is over...
            System.out.println("Zero");
        }           //ONLY ONE OF THIS GET EXECUTED, ONE DECISION WILL BE GIVEN

        System.out.println("------------------------------------------");

        // if ı have one if block and one if else block

        if (n > 0) {
            System.out.println("Positive"); //true
        }
        if (n < 0) {
            System.out.println("Negative"); //false
        } else {
            System.out.println("Zero"); //true // compile looks first n < 0 (negative) line then else.
                                        // which one is true it will print it


        }
    }
}