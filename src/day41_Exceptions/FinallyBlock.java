package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[3]);
            System.out.println("Try Block");

        }catch (RuntimeException e){
            System.out.println("Catch Block"); // Catch Block // ArrayIndexOutOfBoundsException
            e.printStackTrace();
            System.exit(0);

        }finally { // Always executed after try & catch block whether an exception occurs or not
            System.out.println("Finally Block");
        }




    }
}
