package day31_Constructors.FreeTask;

import java.util.Arrays;
import java.util.Collections;


public class StudentTest {

    public static void main(String[] args) {

        Students student1 = new Students("Ahmet", 123, 'M', 15);
        char[] answer1 = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student1.answer = answer1;

        Students student2 = new Students("Kaan", 135, 'M', 16);
        char[] answer2 = {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'};
        student2.answer = answer2;

        Students student3 = new Students("Selin", 144, 'F', 15);
        char[] answer3 = {'B', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student3.answer = answer3;

        Students student4 = new Students("Cem", 111, 'M', 16);
        char[] answer4 = {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'};
        student4.answer = answer4;

        Students student5 = new Students("Gül", 175, 'F', 14);
        char[] answer5 = {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student5.answer = answer5;

        Students student6 = new Students("Hulya", 126, 'F', 16);
        char[] answer6 = {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student6.answer = answer6;

        Students student7 = new Students("Can", 113, 'M', 14);
        char[] answer7 = {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student7.answer = answer7;

        Students student8 = new Students("Ayse", 188, 'F', 16);
        char[] answer8 = {'E', 'B', 'E', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        student8.answer = answer8;

        Students [] studentss = {student1,student8,student6,student2,student3,student4,student5,student7};

        StudentClass class1 = new StudentClass("group-4");
        class1.students.addAll(Arrays.asList(student1,student8,student6,student2,student3,student4,student5,student7));

        StudentClass class2 = new StudentClass("group-4");
        class2.students.addAll(Arrays.asList(student1,student8,student6,student2,student3,student4,student5,student7));

        Collections.reverse(class1.students);
        System.out.println(class1);
        Collections.swap(class1.students, 0 ,2);
        System.out.println(class1);

        

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