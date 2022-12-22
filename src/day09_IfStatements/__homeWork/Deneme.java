package day09_IfStatements.__homeWork;

public class Deneme {

    public static void main(String[] args) {

        double salaryBeforeTax = 100_000;
        boolean isMarried = true;
        double salaryAfterTax, salaryAfterMarried;


        if (salaryBeforeTax >= 130_000) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.35;
        }  else if (salaryBeforeTax >= 100_000 && salaryBeforeTax < 130_000) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.30;
        }  else if (salaryBeforeTax >= 80_000 && salaryBeforeTax < 100_000) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.25;
        }  else if (salaryBeforeTax < 80_000) {
            salaryAfterTax = salaryBeforeTax - salaryBeforeTax * 0.20;
        } else {salaryAfterTax = 0;}

        if(isMarried){
            salaryAfterMarried=salaryAfterTax+salaryBeforeTax*0.05;}
        else {salaryAfterMarried=salaryAfterTax;}
        System.out.println(salaryAfterMarried);
    }


    }

