package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Hourly Rate");
        int hourlyRate = scan. nextInt();
        System.out.println("How many hours do you work for a week?");
        int workingHours = scan.nextInt();
        System.out.println("Enter State Tax");
        double stateTaxRate = scan.nextDouble();
        System.out.println("Enter Federal Tax");
        double federalTaxRate = scan.nextDouble();

       scan.close();

        double salary = hourlyRate * workingHours * 52;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = $" + netIncome);


        /* SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

         */


    }
}
