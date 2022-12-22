package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "BusinessAnalyst", salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }

}

/*

5. Create a subclass of EMployee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have


 */