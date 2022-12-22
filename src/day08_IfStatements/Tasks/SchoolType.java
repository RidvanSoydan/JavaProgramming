package day08_IfStatements.Tasks;

public class SchoolType {

    public static void main(String[] args) {

        byte gradeLevel = 3;

        boolean elementary = gradeLevel>= 1 && gradeLevel <= 5;
        boolean middle = gradeLevel>= 6 && gradeLevel <= 8;
        boolean high = gradeLevel>= 9 && gradeLevel <= 12;
        boolean college = gradeLevel>= 13 && gradeLevel <= 16;
        boolean grad = gradeLevel>= 17 && gradeLevel <= 18;

        if (elementary){
            System.out.println("Elementary school");
        }

        if (middle){
            System.out.println("Middle school");
        }

        if (high){
            System.out.println("High school");
        }

        if (college){
            System.out.println("College school");
        }

        if (grad){
            System.out.println("Grad school");
        }


    }

}


