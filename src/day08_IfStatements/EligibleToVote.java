package day08_IfStatements;

import java.sql.SQLOutput;

public class EligibleToVote {

    public static void main(String[] args) {


        String name = "Josh";
        int age =18;
        String citizen = "USA";

        boolean isELigible = age >= 21 && citizen == "USA"; // AND LOGIC: Both of them must be true

        // either eligible

        if (isELigible) {

            System.out.println( name + " is eligible to vote");
        }

        // Not eligible

        if (!isELigible) { // !true means (not true or false)

            System.out.println(name + " is not eligible to vote");
        }








    }


}
