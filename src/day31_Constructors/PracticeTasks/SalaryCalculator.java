package day31_Constructors.PracticeTasks;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {

        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {

        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }


    public double salary (){

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        return salaryBeforeTax;
    }

    public double stateTax (){

        double stateTax =  salary() * stateTaxRate;
        return stateTax;
    }

    public double federalTax (){

        double federalTax =  salary() * federalTaxRate;
        return federalTax;
    }

    public double salaryAfterTax (){

        double salaryAfterTax =  salary() - (federalTax() + stateTax());
        return salaryAfterTax;
    }
}
/*
1. SalaryCalculator Task:

		1.1 Create a class named Salary calculator:

		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
	            Add a constructor to set all the fields
		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */