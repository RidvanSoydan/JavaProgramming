package day33_Statics.PracticeTasks;

public class CydeoStudentTest {

    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 14, 25, 16, 'C');

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 25, 13, 'A');

        System.out.println(student1); // CydeoStudent{name='Jimmy', age=39, gender=M, id=14, batchNumber=25, groupNumber=16, grade=C}
        System.out.println(student2); // CydeoStudent{name='Kathy', age=29, gender=F, id=15, batchNumber=25, groupNumber=13, grade=A}

        student1.printSchoolName(); // Cydeo School
        student2.printSchoolName(); // Cydeo School

        student1.printProgLanguage(); // Java
        student2.printProgLanguage(); // Java

    }
}
