package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }


    public void breaksDown (){
        System.out.println(brand + " breaks down");
    }

    public void racing (){
        System.out.println(brand + " " + model + " is racing car");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic and jump start to start " + brand + " " + model);
    }


}
