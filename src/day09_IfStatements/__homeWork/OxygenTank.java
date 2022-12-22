package day09_IfStatements.__homeWork;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 10;
        String tankLevel;


        if (level >= 90){
            tankLevel = "Your tank is full";

        } else if (level >= 80 && level <= 90){
            tankLevel = "Still okay";

        } else if (level >= 70 && level <= 80) {
            tankLevel = "Don't go too far";

        } else if (level >= 60 && level <= 70) {
            tankLevel = "Start to head back";

        } else if (level >= 50 && level <= 60) {
            tankLevel = "Be careful now you are at 50%";

        } else {
            tankLevel = "Oxygen is about to FINISH\n\t\tWARNING!!!";
        }

        System.out.print(tankLevel);

    }
}

        /*Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
        and you must print a message based on the level:
            Above 90 -  Your tank is full
            Above 80 -  Still okay
            Above 70 -  Don't go too far
            Above 60 -  Start to head back
            Above 50 -  Be careful now you at at 50%

            USE ONE PRINT STATEMENT ONLY
          */
