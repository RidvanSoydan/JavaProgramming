package day36_Inheritance.encapsulation;

public class StudentObjects {


    public static void main(String[] args) {

    Student student1 = new Student("Rıdvan", 33, 'M', 'A', "Oxford");

        System.out.println(student1.getAge()); // 33
        System.out.println(student1.getGender()); // M

        student1.setGrade('B');
        System.out.println(student1.getGrade()); // B

        student1.study(); // Rıdvan is studying

        System.out.println(student1); // Student{name='Rıdvan', age=33, gender=M, grade=B, schoolName='Oxford'}
    }


}
