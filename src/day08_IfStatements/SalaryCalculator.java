package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65,
            weeklyHours = 40; // Another way of declaring variables, by using COMMA (,)

        double stateTaxRate = 0,
               federalTaxRate = 26.2;
        //------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; //one year salary before tax
        double stateTax = salaryBeforeTax * stateTaxRate / 100; // calculating state tax, DONT FORGET DIVIDING BY 100
        double federalTax = salaryBeforeTax * federalTaxRate / 100; //calculating federal tax, DONT FORGET DIVIDING BY 100
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is $" + salaryBeforeTax);
        System.out.println("State Tax is $" + stateTax);
        System.out.println("Federal Tax is $" + federalTax);
        System.out.println("Total Tax is $" + totalTax);
        System.out.println("Net income is $" + salaryAfterTax);



        /*
       3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
         */











    }
}
