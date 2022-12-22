package day31_Constructors.FreeTask;

public class GroupExample {

    public String name;
    public char gender;
    public int age, studentId;
    public char grade;

    public GroupExample(String name, char gender, int age, int studentId, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String toString() {
        return "groupExample{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", date Of Year=" + dateOfYear() +
                ", grade=" + grade +
                '}';
    }

    public int dateOfYear(){
        return 2022-age;
    }


}
