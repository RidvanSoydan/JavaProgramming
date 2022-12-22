package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        // Creating object of Dog Class

        Dog dog1 = new Dog (); // Dog object created, we assign it variable to be able to reuse

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1); // Hashcode ...
                                  // so we need create toString method inside the Dog Class,
                                  // because I want to print Dog Objects
        // After we create toString
        //Dog {name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}

        Dog dog2 = new Dog();

        System.out.println(dog2); //Dog{name='null', breed='null', age=0, gender= , size='null', color='null'}

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        System.out.println(dog2); //Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}


        Dog dog3 = new Dog(); //I will create method setInfo inside Dog Class ==> To be able set information easily

        dog3.setInfo("Jack", "German Shepard", 3, 'M', "Large", "Black");

        System.out.println(dog3); //Dog{name='Jack', breed='German Shepard', age=3, gender=M, size='Large', color='Black'}


        dog1.eat(); //Lucy is eating

        dog2.bark(); // ACE is barking


        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs =new ArrayList<>();
        femaleDogs.add(dog1);

        ArrayList<Dog> maleDogs =new ArrayList<>();
        maleDogs.add(dog2);
        maleDogs.add(dog3);
        maleDogs.add(dog4);
        maleDogs.add(dog5);

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);




    }
}
