package day33_Statics.PracticeTasks;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("Can", 28, 'M');
        Person p2 = new Person("Cana", 32, 'F');

        System.out.println(p1); // Person{name='Can', age=28, gender=M}
        System.out.println(p2); // Person{name='Cana', age=32, gender=F}

        p1.eat("Apple"); // Can is eating Apple
        p2.drink("Juice"); // Cana is drinking Juice


        System.out.println(p1.numberOfHead); // 1
        System.out.println(p2.numberOfHead); // 1


        System.out.println(p1.numberOfEyes); // 2
        System.out.println(p1.numberOfEyes); // 2


    }
}
