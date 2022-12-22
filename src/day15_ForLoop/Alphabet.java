package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        //A-Z, Z-A, a-z, z-a....

        for (char i = 'A'; i <= 'Z'; i ++){
            System.out.print(i + " ");
        }

        System.out.println();

        //another way with int ==> 65 ~ 90 (from ascii table)

        for (int i = 65; i<=90; i ++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i --){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'a'; i <= 'z'; i +=1){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'z'; i >= 'a'; i --){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 1; i<= 400; i++){ //first 400 character of ascii table
            System.out.print(i + " ");
        }

    }
}
