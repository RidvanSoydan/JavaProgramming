package day47_Polymorphism;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Person;
import day43_Abstraction.employeeTask.Tester;
import day44_Abstraction_Interface.animalTask.Animal;
import day44_Abstraction_Interface.animalTask.Cat;
import day44_Abstraction_Interface.animalTask.Dog;
import day45_Abstraction_Interface.browserTask.WebDriver;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Shape;
import day45_Abstraction_Interface.shape.Square;

public class ReferenceTypeCastings {


    public static void main(String[] args) {


    //  Shape shape = (Shape) new Circle(4); // upcasting => Done implicitly

        Shape shape2 = new Circle (5);

    //  WebDriver driver = (WebDriver) new ChromeDriver();

      Dog dog2 = new Dog("Lucy", "Husky", 'M', 4, "Small", "Black");;
      Dog dog3 = dog2;

        Animal animal = (Animal) new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog)animal;
    //  animal.bark (); ==> Compile Error
        ((Dog)animal).bark(); //Max is barking

        System.out.println(animal.getName()); // Max
        System.out.println(dog.getName());    // Max


        Shape shape1 = new Square(5);
        System.out.println( ((Square) shape1).getSide()  ); // 5.0

        System.out.println("---------------------------------------------------");


        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        // Cat cat = (Cat) animal2;
        // cat.meow();

        ( (Cat) animal2 ).meow(); //Jim is meowing

    //  ((Dog) animal2).bark(); // ClassCastException ==> There is no "IS A RELATION" between Cat and Dog classes

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport(); //Ali is creating bug reports

    //  ( (Tester) employee ).unitTest();
    //  ( (Developer) employee ).unitTest(); //ClassCastException

               // Object is Tester object
    //  Driver driver = (Driver) employee;  // line 1   => ClassCastException
        Person person = (Person) employee; // line 2    => Upcasting
    //  Teacher teacher = (Teacher) employee; // line 3 => ClassCastException

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

    // ((Cube)s1).volume(); => ClassCastException


    }
}
