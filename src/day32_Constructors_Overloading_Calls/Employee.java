package day32_Constructors_Overloading_Calls;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee (String name) { // I don't have to use all instance variables
        this.name = name;
    }


    public Employee (String name, char gender) {
        this (name);  // Employee (name) ==> Constructors cannot be called by using constructor name
        this.gender = gender;
    }


    public Employee (String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee (String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    /*
    public void method1(){
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary = $" + salary +
                '}';
    }


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */





}
