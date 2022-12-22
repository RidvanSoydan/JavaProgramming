package day31_Constructors.FreeTask;

import java.time.LocalDate;
import java.util.Arrays;


public class Students {
    public String name;
    public int studentID;
    public char gender;
    public int age;
    public char[]answer = new char[10];

    public Students(String name, int studentID, char gender,int age) {
        this.name = name;
        this.studentID = studentID;
        this.gender=gender;
        this.age=age;

    }
    public void getScore(){

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count =0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]==keys[i]){
                count++;
            }
        }
        System.out.println(name + " has " + count + " correct answer");


    }
    public void questionNumber(int n){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        if(answer[n]==keys[n]){
            System.out.println(name + " gave right answer");
        }else{
            System.out.println(name + " gave wrong answer");
        }
    }
    public void dateOfBorn(){
        System.out.println(name+ " was born in " + (LocalDate.now().getYear()-age));
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", gender=" + gender +
                ", age=" + age +
                ", answer=" + Arrays.toString(answer) +
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