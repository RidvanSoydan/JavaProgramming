package day11_Switch_Scanner;

public class GradeReport_Switch {

    public static void main (String [ ] args ){


        char givenGrade = 'D';
        String result = "";

        switch (givenGrade) {

            case 'A':
                result ="Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

            System.out.println("result = " + result);

        }

        /*
        a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
         */


    }
}
