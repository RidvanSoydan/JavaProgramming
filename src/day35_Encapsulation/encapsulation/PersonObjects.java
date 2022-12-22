package day35_Encapsulation.encapsulation;

import day35_Encapsulation.encapsulation.Person;

public class PersonObjects {

    public static void main(String[] args) {
        
        
        day35_Encapsulation.encapsulation.Person p1 = new Person();

     // p1.name = "Ali"; error => name is private and we cannot reach
     // p1.age = 27;     error => age is private and we cannot reach

        p1.setName("");
        System.out.println(p1.getName()); // Invalid name !!!
     // Because of System.exit (0) method compiler won't run the other codes

        p1.setName("Ali");
        p1.setAge(27);

        //   p1.name = "";
        //   p1.age = 2000;


     // System.out.println(p1.name + " " + p1.age); // error
        System.out.println(p1.getName() + " " + p1.getAge());
        
        
        
    }
}
