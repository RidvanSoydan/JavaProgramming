package day08_IfStatements;

public class A_LogicalOperators {

    public static void main(String[] args) {

  /*          OPERATOR        DESCRIPTION
                &&          Logical AND  // You are appliying AND logic (MEANS BOTH) Both expressions needs to be true in order to take true result
                ||          Logical OR  //You are appliying OR logic    (MEANS EITHER) One of the expressions needs to be true in order take true result
                !           Logical NOT
        */

        // && and || is used for to create multiple boolean variable within one conditions

        // is somebody eligible for Vote, I have to create AND LOGIC, both must be true


        //LOGICAL AND


        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        //age has to be at least 19, citizenship has to be USA

        boolean isEligible = age >= 18 && citizen == "USA" ; //I used AND LOGIC (&&) to see the both expressions is true or not
                          // 19 >= 18 && "UK" = "USA"
                            //true           false
        System.out.println(name + " is eligible to vote " + isEligible);

        System.out.println("----------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;


        boolean isEligible1 = creditScore >= 700 && age2 >= 21 && income >= 39000; //if all conditions true, result will be true
        System.out.println(name2 + " is eligible for loan : " + isEligible1);

        System.out.println("------------------------------------------------------");

        //LOGICAL OR

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean iseligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
                //              21>=18       'F' == 'M'          'F' == 'F'
                //              true          (  false     ||      true )
                //              true                    true
                //                     true                             // Final Result is TRUE

        System.out.println(name3 + " is eligible to register : " + iseligible3);

        System.out.println("--------------------------------------------");

        // to be a USA citizen what is needed

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = true;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true; //Only one of them has ta meet
        //                          false                       true
        System.out.println(name4 + " is eligible to apply for US citizenShip : " + isEligible4);

        System.out.println("---------------------------------------------------");

        String student = "Anna";  //is eligible for Scholarship (BURS)

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <=60000;
        //                      true            false
        System.out.println(student + " is eligible for scholarship is : " + isEligible5);

        System.out.println("-----------------------------------------------------------");

        // Logical NOT Operator (!)

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("resul3 = " + result3);

        System.out.println("------------------------------------------------------------");

        int score = 85;
        boolean passed = score >=60; //Only one of this situation can be true,
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }


}
