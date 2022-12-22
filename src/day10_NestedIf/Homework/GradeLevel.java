package day10_NestedIf.Homework;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 12;
        boolean validGrade = gradeLevel >=1 && gradeLevel <=18;
        String result = "";

        if (validGrade) {

            if (gradeLevel >=1 || gradeLevel < 6) {
                result = "Elementary school";
            }else if (gradeLevel >= 6 || gradeLevel < 9) {
                result = "Middle school";
            }else if (gradeLevel >= 9 || gradeLevel < 13) {
                result = "High school";
            }else if (gradeLevel >= 13 || gradeLevel < 17) {
                result = "Collage";
            }else {
                result = "Grad School";
            }
        }else {
            result ="Invalid Grade given!!!";
        } System.out.println(result);



        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level determine and
        print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
    }
}
