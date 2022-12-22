package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        BMW bmw  = new BMW("A5", 2020, 150350,"Blue", 4500);

        bmw.breaksDown();
        bmw.racing();
        bmw.start();

        Toyota toyota = new Toyota("Auris", 2017, 100000, "Red", 13000);

        System.out.println(toyota);
        toyota.start();

        Tesla tesla = new Tesla("TS", 2022, 175000, "White", 500);

        System.out.println(tesla);
        tesla.start();

    }
}
