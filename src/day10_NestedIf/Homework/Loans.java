package day10_NestedIf.Homework;

public class Loans {

    public static void main(String[] args) {

        double salary = 75000;
        int creditScore = 651;
        boolean loanApproval = salary > 60000 && creditScore > 650;


        System.out.println((loanApproval) ? "Loan Approved"   : "Loan Denied");

        /*Create a class called Loans, Given two variables salary and credit score,
        use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

         */
    }
}
