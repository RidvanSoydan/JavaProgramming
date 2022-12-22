package day10_NestedIf;

public class Ternaries {

    public static void main(String[] args) {

        /*  90 ~ 100: Excellent
            80 ~ 89 : Great
            70 ~ 79 : Good
            60 ~ 69 : Passed
            0  ~ 59 : failed
            */

        int score = 75;

        if (score >= 0 && score <= 100) { //if the score valid, 5 possibilities: A, B, C, D, F
            // if the pre condition is failed, no way to look 5 possibilities

            if (score >= 90) {        // "&&score <=100" is unnecessary now, because this expression already checked above block
                System.out.println("Excellent");

            } else if (score >= 80) { //"&& score < 90" is unnecessary, because this expression already checked above
                System.out.println("Great");

            } else if (score >= 70) {
                System.out.println("Good");

            } else if (score >= 60) {
                System.out.println("Passed");

            } else {
                System.out.println("failed");
            }

        } else { // if the score not valid
            System.out.println("Invalid Score");
        }

        System.out.println("----------------------------------------------------");


    }
}