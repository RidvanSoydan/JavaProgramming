package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {


        boolean a = false;

        for (int i = 0; a;) {

            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("--------------------------------");

        while (a) {

            System.out.println("Wooden Spoon - while loop");  //Condition is false, so Wooden Spoon will never be printed...
        }                                        //While loop first looks the condition...

        System.out.println("---------------------------------");


        do {
            System.out.println("Wooden Spoon - do-while loop"); //Do block will be printed...
                                                //In second step the condition will be checked..
        } while (a);

    }
    }

