package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    // @Override ==> If this gives error, this means that method above is not overriden
    public void reliable (){
        System.out.println(brand + " is reliable");
    }

    @Override
    public void start (){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }

}
