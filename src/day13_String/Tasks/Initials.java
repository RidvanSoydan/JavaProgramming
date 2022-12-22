package day13_String.Tasks;

public class Initials {

    public static void main(String[] args) {

        String word = "Ali";

        String word2 = "Can";

        char firstCh = word.toUpperCase().charAt(0);
        char lastCh = word2.toUpperCase().charAt(0);

        System.out.println(firstCh + "." +lastCh);


        /*4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

         */


    }
}
