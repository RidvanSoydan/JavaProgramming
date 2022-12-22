package day10_NestedIf;

public class GradeReport_Nested_If {

    public static void main(String[] args) {

        /*  90 ~ 100: Excellent
            80 ~ 89 : Great
            70 ~ 79 : Good
            60 ~ 69 : Passed
            0  ~ 59 : failed
            */

        int score = 75;

        if (score >=0 && score <=100) { //if the score valid, 5 possibilities: A, B, C, D, F
                                        // if the pre condition is failed, no way to look 5 possibilities

            if (score >=90){        // "&&score <=100" is unnecessary now, because this expression already checked above block
                System.out.println("Excellent");

            } else if (score >= 80 ) { //"&& score < 90" is unnecessary, because this expression already checked above
                System.out.println("Great");

            } else if (score >= 70) {
                System.out.println("Good");

            } else if (score >= 60) {
                System.out.println("Passed");

            } else {
                System.out.println("failed");
            }

        }else { // if the score not valid
            System.out.println("Invalid Score");
        }
        System.out.println("----------------------------------------------------");

        String result = ""; // temporary

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )

            if(score>= 90 ){ //false:  score < 90
                result = "Excellent";

            }else if(score >= 80 ){ // false: score < 80
                result = "Great";

            }else if(score >= 70){ // false: score < 70
                result = "Good";

            }else if(score >= 60){// false: score < 60
                result = "Passed";

            }else{
                result = "Failed";
            }

        }else{ // if the score is NOT valid
            result = "Invalid Score";
        }


        System.out.println( result);




    }
}
