package day39_Encapsulation_Inheritance_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Lion "+getName()+" hunts buffaloes");
    }

}
