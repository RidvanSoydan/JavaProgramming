package day23_CustomMethods_Void.Tasks;

public class PrintingEvenNumbers {

    //create a method that can print even numbers between 1~100 in a same line saperated by space

    public static void main(String[] args) {

        int number = 100;

        printEvenNumber(number);

    }

    public static void printEvenNumber(int number) {

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }



}