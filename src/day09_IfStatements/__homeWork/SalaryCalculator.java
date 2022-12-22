package day09_IfStatements.__homeWork;

public class SalaryCalculator {

    public static void main(String[] args) {


        double salaryBeforeTax = 100_000;
        boolean isMarried = true;
        double salaryAfterTax;

        if (salaryBeforeTax >= 130_000 && isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.30;
        } else if (salaryBeforeTax >= 130_000 && !isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.35;

        } else if (salaryBeforeTax >= 100_000 && salaryBeforeTax < 130_000 && isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.25;
        } else if (salaryBeforeTax >= 100_000 && salaryBeforeTax < 130_000 && !isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.30;

        } else if (salaryBeforeTax >= 80_000 && salaryBeforeTax < 100_000 && isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.20;
        } else if (salaryBeforeTax >= 80_000 && salaryBeforeTax < 100_000 && !isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.25;

        } else if (salaryBeforeTax < 80_000 && isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.15;
        } else if (salaryBeforeTax < 80_000 && !isMarried) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.20;

        }else {
            salaryAfterTax = 0;
        }
        System.out.println(salaryAfterTax);
    }
}




        /*Write a program that can calculate the salary after tax based on the
          following requirements
                the tax rates are:
                35% for salary of 130K or more
                30% for salary of 100K to 130k (excluded)
                25% for salary of 80K to 100K (excluded)
                20% for salary less than 80K
                in addition, if the person is married, he/she will pay 5% less tax
         */





