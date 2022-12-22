package day31_Constructors.FreeTask;

import java.util.ArrayList;

public class SbGroupExampleObjects {

    public static void main(String[] args) {

        SbGroupExample student1 = new SbGroupExample("Engin", 'M', 40, 2210, 'F');
        SbGroupExample student2 = new SbGroupExample("Hülya", 'F', 26, 2123, 'B');
        SbGroupExample student3 = new SbGroupExample("Ali", 'M', 24, 2121, 'B');
        SbGroupExample student4 = new SbGroupExample("Veli", 'M', 23, 2119, 'F');
        SbGroupExample student5 = new SbGroupExample("Ayşe", 'F', 35, 2133, 'F');
        SbGroupExample student6 = new SbGroupExample("İnci", 'F', 33, 2143, 'A');
        SbGroupExample student7 = new SbGroupExample("Ömer", 'M', 22, 2153, 'B');
        SbGroupExample student8 = new SbGroupExample("Aygün", 'F', 39, 2210, 'A');

        SbGroupExample[] subGroupExamples = {student1, student2, student3, student4, student5, student6, student7, student8};
        ArrayList<String> subGroupExampleList = new ArrayList<>();
        ArrayList<String> nameOfSubGroupExampleList = new ArrayList<>();
        ArrayList<Integer> ageOfSubGroupExampleList = new ArrayList<>();


        for (SbGroupExample each : subGroupExamples) {

            subGroupExampleList.add(each.name + " " + each.studentId + " " + each.grade);
            ageOfSubGroupExampleList.add(each.age);

            if(!(each.name.isEmpty())){
                nameOfSubGroupExampleList.add(each.name);
            }

            if(each.yearOfBirth() < 1995){
                System.out.println("Name/Birth Year = " + each.name + " " + each.yearOfBirth());
            }
        }

        System.out.println("ageOfSubGroupExampleList = " + ageOfSubGroupExampleList);
        System.out.println("nameOfSubGroupExampleList = " + nameOfSubGroupExampleList);
        System.out.println("subGroupExampleList = " + subGroupExampleList);


    }
}
