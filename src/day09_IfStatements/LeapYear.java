package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2003; //I want to print either leap year or not leap year

        boolean leapYear = year % 4==0;

        if (leapYear) {
            System.out.println("Year " + year + " is leap year");
        } else {
            System.out.println("Year " + year + " is NOT leap year");
        }


        if(leapYear){
            System.out.println("Year "+year+" is a leap year");
        }

        if(!leapYear){
            System.out.println("Year "+year+" is NOT a leap year");
        }














    }
}
