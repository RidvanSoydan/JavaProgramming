package day31_Constructors.FreeTask;

public class SbGroupExample {

    public String name;
    public char gender;
    public int age, studentId;
    public char grade;

    public SbGroupExample(String name, char gender, int age, int studentId, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String toString() {
        return "subGroupExample{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }

    public int yearOfBirth(){
        return 2022-age;
    }
}
