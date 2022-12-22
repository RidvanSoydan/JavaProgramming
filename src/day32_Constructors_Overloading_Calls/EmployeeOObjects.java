package day32_Constructors_Overloading_Calls;

public class EmployeeOObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Ali");
        System.out.println("employee1 = " + employee1);


        Employee employee2 = new Employee("Veli", 'M');
        System.out.println("employee2 = " + employee2);

        Employee employee3 = new Employee("Can", 'M', "SDET");
        System.out.println("employee3 = " + employee3);

        Employee employee4 = new Employee("Ayşe", 'F', "DevOps", 100000);
        System.out.println("employee4 = " + employee4);




    }
}
