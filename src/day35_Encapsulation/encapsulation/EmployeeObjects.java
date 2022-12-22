package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Can", 'M', 33, 120000);

        System.out.println(e1); // Employee{name='Can', gender=M, age=33, salary=120000.0}

        e1.setAge(25);
        e1.setSalary(150000);
        System.out.println(e1); // Employee{name='Can', gender=M, age=25, salary=150000.0}



        Employee e2 = new Employee("Ayşe", 'F', 21, 115000);

        System.out.println(e2); // Employee{name='Ayşe', gender=F, age=21, salary=115000.0}

        e2.setName("Elvira");
        e2.setSalary( e2.getSalary() + 15000 );
        System.out.println(e2); // Employee{name='Elvira', gender=F, age=21, salary=130000.0}


    }





}
