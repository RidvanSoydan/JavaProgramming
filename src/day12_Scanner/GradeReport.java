package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score");

        String result = "";

        int score = scan.nextInt();
        scan.close();
        boolean validScore = score >=0 && score <=100;

        if (validScore) {
            if (score >= 90) { result = "A";}
            else if (score >= 80) { result = "B";}
            else if (score >= 70) {result = "C";}
            else if (score >=60) {result = "D";}
            else { result = "F";}
        }else {
            result = "Invalid Score";
        }
        System.out.println(result);

    }
}


        /*GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score


         */



