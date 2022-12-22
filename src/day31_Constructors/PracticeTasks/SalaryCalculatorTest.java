package day31_Constructors.PracticeTasks;

public class SalaryCalculatorTest {

    public static void main(String[] args) {



        SalaryCalculator s1 = new SalaryCalculator(40, 0.075, 0.12, 40);

        System.out.println("s1 = " + s1);
        System.out.println("Salary Before Tax : " + s1.salary());
        System.out.println("State Tax : " + s1.stateTax());
        System.out.println("Federal Tax : " + s1.federalTax());
        System.out.println("Salary After Tax : " + s1.salaryAfterTax());

    }
}
