package day33_Statics.PracticeTasks;

public class CarTest {


    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", "Gray", 2021, 35000);

        System.out.println(car); // Car{make='Toyota', model='Corolla', color='Gray', year= 2021, price= $35000.0}
        car.drive();


    }
}
