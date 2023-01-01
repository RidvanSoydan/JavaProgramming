package day39_Encapsulation_Inheritance_Recap.animalTask;

public class Python extends WildAnimal{

    public Python(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Python "+getName()+" hunts lizards");
    }

}
