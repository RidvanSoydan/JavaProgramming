package day08_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        /*
         write a program that can display the name of the day
number = 1 ~ 7

         */

            int number =4; // 1 ~ 7

            boolean d1 =number==1;
            boolean d2 =number==2;
            boolean d3 =number==3;
            boolean d4 =number==4;
            boolean d5 =number==5;
            boolean d6 =number==6;
            boolean d7 =number==7;

            if(d1){
                System.out.println("Monday.");
                    }

            if(d2){
                System.out.println("Tuesday");
            }
            if(d3){
                System.out.println("Wednesday.");
            }
            if(d4){
                System.out.println("Thursday");
            }
            if(d5){
                System.out.println("Friday.");
            }
            if(d6){
                System.out.println("Saturday.");
            }
            if(d7){
                System.out.println("Sunday.");
            }

        }



}













