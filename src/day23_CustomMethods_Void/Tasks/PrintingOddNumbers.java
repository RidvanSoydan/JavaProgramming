package day23_CustomMethods_Void.Tasks;

public class PrintingOddNumbers {

    //create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void main(String[] args) {

        int number = 100;
        printOddNumber(number);

    }

    public static void printOddNumber (int number){

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0){
                System.out.print (i + " ");
            }
        }
    }




}
