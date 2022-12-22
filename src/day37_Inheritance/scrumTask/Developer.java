package day37_Inheritance.scrumTask;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }


    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

    public String toString() {
        return "Developer{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
4. Create a subclass of Employee named Developer:

			Add any extra variable or method that Developer object need to have


 */