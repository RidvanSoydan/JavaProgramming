package day37_Inheritance.animalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){ // We don't have scratch method inside parent class so we need to create manually
         System.out.println(name+" is scratching");
    }

}
