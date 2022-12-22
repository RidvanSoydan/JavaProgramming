package day09_IfStatements;

public class GradeReport_Multi_Branch_If {

    public static void main(String[] args) {

        // Task : Grade report ==> A, B, C, D, F

        int score = 110;
        String name = "Mahoni";
        String report;

        if (score >= 90 && score <= 100) {
            report = " grade is A, Excellent!";
        } else if (score >= 80 && score <= 89){
            report = " grade is B, Very Good!";
        } else if (score >= 70 && score <= 79){
            report = " grade is C, Good!";
        } else if (score >= 60 && score <= 69) {
            report = " grade is D, Passed!";
        } else if (score >= 0 && score <= 59){
            report = " grade is F, Failed!!! :((";
        } else {
            report = " score can not be smaller than 0 and bigger than 100";
        }

        System.out.println(name + "'s" + report);

    }
}
