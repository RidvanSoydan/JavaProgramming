package day33_Statics;

public class IPhone {


    public static String brand = "Apple";

    public String model;
    public double price;

    public static String OS = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){   // Static method
        System.out.println(OS);                  // Static means there will be one copy
    }                                            // If the method is instance you have to create object, (Instances will use bigger memory)
                                                 // if the method is static you dont have create objects

    /* public static void printModelAndPrice(){
       System.out.println(model+" : "+price); // static methods does not accept instances
       }
    */


    public void method1 (){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }



// toString is instance method, it accepts both instance and static variables...


}
