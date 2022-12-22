package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        /*
 1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School
                        For Any Other grade: Invalid grade level given
                Note:
                    Solution 1: use if & switch both
                    Solution 2: Use switch statement*/

        byte number = 19;

        boolean valid = number >=1 && number <=18; //1 - 18

        String SchoolType = "";

        if (valid){

            switch (number) {

                case 1: case 2: case 3: case 4: case 5:
                    SchoolType = "Elementary school";
                    break;
                case 6: case 7: case 8:
                    SchoolType = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    SchoolType = "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    SchoolType = "Collage";
                    break;
                 default:
                    SchoolType = "Grad School";
            }
            System.out.println("SchoolType = " + SchoolType);

        }else {

            SchoolType = "Invalid";

            System.out.println("SchoolType = " + SchoolType);
        }


        System.out.println("------------------------------------------------");

        byte number2 = 4;

        String SchoolType2 = "";

            switch (number2) {

                case 1: case 2: case 3: case 4: case 5:
                    SchoolType2 = "Elementary school";
                    break;
                case 6: case 7: case 8:
                    SchoolType2 = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    SchoolType2 = "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    SchoolType2 = "Collage";
                    break;
                case 17: case 18:
                    SchoolType2 = "Grad School";
                default:
                    SchoolType2 = "Invalid";
            }
            System.out.println("SchoolType = " + SchoolType2);

        }



    }

