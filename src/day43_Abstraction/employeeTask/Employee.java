package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public abstract void work();


    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
