package day31_Constructors.FreeTask;

import java.util.ArrayList;
import java.util.Collections;

public class GroupExampleObjects {

    public static void main(String[] args) {

   GroupExample student1 = new GroupExample("Engin", 'M', 40, 2210, 'F');
   GroupExample student2 = new GroupExample("Hülya", 'F', 26, 2123, 'B');
   GroupExample student3 = new GroupExample("Ali", 'M', 24, 2121, 'B');
   GroupExample student4 = new GroupExample("Veli", 'M', 23, 2119, 'F');
   GroupExample student5 = new GroupExample("Ayşe", 'F', 35, 2133, 'F');
   GroupExample student6 = new GroupExample("İnci", 'F', 33, 2143, 'A');
   GroupExample student7 = new GroupExample("Ömer", 'M', 22, 2153, 'B');
   GroupExample student8 = new GroupExample("Aygün", 'F', 39, 2210, 'A');

   GroupExample[] GroupExamples = {student1, student2, student3, student4, student5, student6, student7, student8};

   ArrayList<String> GroupExampleList = new ArrayList<>();

   ArrayList<String> nameOfGroupExampleList = new ArrayList<>();

   ArrayList<Integer> ageOfGroupExampleList = new ArrayList<>();

   ArrayList<String>oddId=new ArrayList<>();

   ArrayList<Integer> studentIDList = new ArrayList<>();


   int sum=0;

   int numberOfFemale=0;

   for (GroupExample each : GroupExamples) {

       GroupExampleList.add(each.name + " " + each.studentId + " " + each.grade);
       ageOfGroupExampleList.add(each.age);

       if(!(each.name.startsWith("A"))){
           nameOfGroupExampleList.add(each.name);
       }

       if(each.dateOfYear()<1995){
           System.out.println("Name/Birth Year = " + each.name + " " + each.dateOfYear());
       }

       if(each.studentId%2==1){
           oddId.add(each.name + " " +each.studentId);
       }

       if(each.gender == 'F'){
           sum+=each.age;
           numberOfFemale++;
       }

       studentIDList.add(each.studentId);
   }


   for (Integer each : studentIDList) {

       int a = Collections.frequency(studentIDList,each);

       if(a!=1){
           System.out.println("Dublicate student id" + each);
       }
   }

   double averageAgeOfFemale = sum / numberOfFemale;
   System.out.println("ageOfGroupExampleList = " + ageOfGroupExampleList);
   System.out.println("nameOfGroupExampleList = " + nameOfGroupExampleList);
   System.out.println("GroupExampleList = " + GroupExampleList);
   System.out.println("oddId = " + oddId);
   System.out.println("averageAgeOfFemale = " + averageAgeOfFemale);

    }
}
