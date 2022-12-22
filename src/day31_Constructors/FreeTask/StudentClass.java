package day31_Constructors.FreeTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentClass {

    public String name;
    public int numberOfStudent;
    public static String schoolName="Cydeo School";
    public ArrayList<Students> students = new ArrayList<>();

    public StudentClass(String name) {
        this.name = name;

    }

   public int numberOfStudent(){

        return students.size();
    }

    public void getScores(){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : students) {
        int count =0;
        String result="";

        for (int i = 0; i < student.answer.length; i++) {
            if(student.answer[i]==keys[i]){
                count++;

            }else{
                result+=(i+1)+" ";
            }
        }
        System.out.println(student.name + " has " + count + " correct answer and gets " + (count*10)+ "points" + " questions " + result + " are wrong");
    }
    }
    public void getStudent(Students student){

        students.add(student);
    }
    public void getMaleStudent(Students [] studentss){
        for (int i = 0; i<studentss.length; i++)
        if(studentss[i].gender=='M'){
            students.add(studentss[i]);
        }
    }
    public void getFemaleStudent(Students [] studentss){
        for (int i = 0; i<studentss.length; i++)
            if(studentss[i].gender=='F'){
                students.add(studentss[i]);
            }
    }

    public String getNames(){
        String result="";
        for (Students student : students) {
            result+=student.name+", ";
        }
        return result;
    }

    public void questionNumber(int n){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : students) {
            if(student.answer[n]==keys[n]){
                System.out.println(student.name + " gave right answer");
            }else {
                System.out.println(student.name + " gave wrong answer");
            }
        }
    }
    public void getAges(){
        for (Students student : students) {
            System.out.println(student.name+ " is " + student.age + " years old");
        }
    }
    public void howMany(int num) {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count =0;
        for (Students student : students) {
            if(student.answer[num]==keys[num]){
               count++;
            }
        }
        System.out.println(count + " students gave right answer");
    }
    public void analyze() {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count = 0;
        for (int i = 0; i < keys.length; i++) {
            for (Students each : students) {
                if (each.answer[i] == keys[i]) {
                    count++;
                }
            }
            System.out.println("question" + (i + 1) + " :  " + count);
            count = 0;
        }
    }
    public  void dateOfBorn(){
        for (Students student : students) {
            System.out.println(student.name + " was born in " + (LocalDate.now().getYear()-student.age));
        }
    }
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                "school name='" + schoolName + '\'' +
                ", number of student=" + numberOfStudent() +
                ", students=" + getNames() +
                '}';
    }
}

/*
Suppose you need to write a program that grades multiple-choice tests. Assume there are eight students and ten questions.


A. Students:	(Custom Class)
1. Create a Class called Students.
2. Each object has name, studentID, gender, age, answer[] attributes.
name should be String, studentID and age should be int, gender should be char, answer should be char array.
3. Write a constructor method.
4. Write a method called getScore. When we call this method it should give us the grade of that student.
5. Write a method called questionNumber. When we call this method it should give us whether that student gives correct answer or not.
6. Write toString method.



B. StudentClass:	(Custom Class)
1. Create a Class called StudentClass.
2. Each object has name, numberOfStudent, schoolName, students attributes.
name and schoolName should be String, studentID should be int, students should be ArrayList.
3. Write a constructor method. (only for name)
4. Write a method called numberOfStudent. When we call this method it should give us the number of students in the class.
5. Write a method called getScore. When we call this method it should give us the grade of all students.
6. Write a method called getStudent. When we call this method it should add that student to students ArrayList.
7. Write a method called getMaleStudent. When we call this method it should add that student to students ArrayList if the student is male.
8. Write a method called getFemaleStudent. When we call this method it should add that student to students ArrayList if the student is female.
9. Write a method called removeMaleStudent. When we call this method it should remove all the male students from the ArrayList.
10. Write a method called removeMaleStudent. When we call this method it should remove all the female students from the ArrayList.
11. Write a method called getNames. When we call this method it should get name of each student.
12. Write a method called questionNumber. When we call this method it should show us whether each student gives the correct answer or not.
13. Write a method called getAges. When we call this method it should give age of each student.
13. Write a method called howMany. When we call this method it should give how many students give correct answer to this question.
14. Reverse the students order in the class.
14. Replace the 3rd and 5th students in the class.


C. StudentTest:	(Main Class)
1. Create 8 student objects.
2. Call the methods which we created in the custom classes.
 */