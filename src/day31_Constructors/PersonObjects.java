package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {


        Person person1 = new Person("Ahmet", 'M', 33);

        Person person2 = new Person ("Canan", 'F', 32);
        person2.age = 34; // assigning new data after object created

        System.out.println(person1);
        System.out.println(person2);



    }
}
