package day39_Encapsulation_Inheritance_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void swim(){
        System.out.println(getName()+" is swimming under the water");
    }

}
