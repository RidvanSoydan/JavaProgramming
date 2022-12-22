package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Zeytin", "Husky", 'M', "Small", 2, "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog); // Animal{name='Zeytin', breed='Husky', gender=M, size=Small, age=2, color='White'}

        Cat cat = new Cat();

        cat.setInfo("Tarçın","British",'M',"Small",3,"Brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);


        Tiger tiger = new Tiger(); // Animal{name='Tarcin', breed='British', gender=M, size=Small, age=3, color='Brown'}

        tiger.setInfo("Sher Khan", "Bengal", 'M', "Large", 4, "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);// Animal{name='Sher Khan', breed='Bengal', gender=M, size=Large, age=4, color='Orange'}

     // tiger.bark();






    }
}
