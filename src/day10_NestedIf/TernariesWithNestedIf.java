package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {


       int score = 110;

       if (score >=0 && score <= 100) {

            if(score >= 60) {
                System.out.println("Passed"); //String
            } else {
                System.out.println("Failed"); // String
            }

        } else {
            System.out.println("Invalid Score"); //String
        }
        //I can apply for these nested if blocks with Ternaries
        //If you have nested if block try NOT TO APPLY FOR TERNARIES because ternaries with nested if are not READABLE

        String result = (score >=0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Invalid Score"; //Not Readable
        System.out.println("result = " + result);

    }
}
