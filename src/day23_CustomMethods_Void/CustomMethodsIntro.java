package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    public static void main(String[] args) { //Java works top to bottom inside the code blocks { }
                                             //If you have two independent methods, it does not mean that Java will
                                                 // execute first the upper one...
        System.out.println();
        System.out.println("Test Started"); // Main method is used for printing the statements...
        System.out.println();               //If we don't write inside the main method body we cannot print anything on console...

        greeting();
        greeting();

        System.out.println("Test Completed");
    }

    public static void greeting(){

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
        System.out.println();

    }



    }
