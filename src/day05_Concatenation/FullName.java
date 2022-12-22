package day05_Concatenation;

import java.sql.SQLOutput;

public class FullName {

    public static void main(String[] args) {

    /*
    1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
*/


    String firstName = "Rıdvan";
    String lastName = "Soydan";
    String fullname = firstName + " " + lastName;
    int age = 33;
    String jobTitle = "Senior SDET";
    String companyName = "Apple Inc";
    double salary = 55500.22;



        System.out.println(fullname);// This is variable
        //full name of the person is ...
        System.out.println("Full name of the person is " + firstName + " " + lastName + ".");
        System.out.println("Full name of the person is " + fullname + ".");
        //full name of the person is ... and is ... years old...
        System.out.println("Full name of the person is " + fullname + " and he is " + age + " years old");
        // ... is ... years old..
        System.out.println(fullname + " is " + age + " years old.");
        //full name is jobtitle at company name
        System.out.println(fullname + " is " + jobTitle + " works at " + companyName + ". Salary is $" + salary + ".");

        // ALL + OPERATORS IS CONCATENATION...
        // PAY ATTENTION TO THE SPACES...
}
}
