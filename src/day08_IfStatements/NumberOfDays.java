package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {


        int number = 12; // 1 ~12

        boolean has28days = number == 2; // FOR THE MONTH THAT HAS 28 DAYS

        boolean has30days = number == 4 || number == 6 || number == 9 || number == 11; // for the months that has 30 days

        boolean has31days = !has30days && !has28days; //if the month does not have 28 days and does not have 30 days

        // ANOTHER HARD WAY ==> boolean has31days = number == 1 || number == 3 || number == 5 ...............

        if (has28days) { // if the month has 28 days and it will print 28 days
         System.out.println("28 days");
        }

        if (has30days){ //if the months has 30 days and it will print 30 days
        System.out.println("30 days");
        }

        if (has31days) { // if the months has 31 days and it will print 31 days
        System.out.println("31 days");
        }

/*
3. Write a program that can print the number of days in a month
Ex:
number = 1 ~ 12;

output:
31 Days

Hints:
Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days: 4, 6, 9, 11
Months that has 28 days: 2

 */


    }

}