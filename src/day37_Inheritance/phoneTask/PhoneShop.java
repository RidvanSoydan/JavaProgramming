package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {


        IPhone iphone = new IPhone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("1110", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense(); // You can use Nokia 1110 as self defense tool

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery ); //true
        System.out.println( IPhone.hasBattery ); //true
        System.out.println( Samsung.hasBattery ); //true
        System.out.println( Nokia.hasBattery ); //true

    }
}

