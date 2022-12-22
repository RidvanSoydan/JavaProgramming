package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();          //Java ProgrammingEnter

        System.out.println("Enter your Building Number");
        String buildingNumber = scan.next();        //7925A

        scan.nextLine(); //Enter

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();  //Jones Branch DriveEnter

        System.out.println("Enter your city name");
        String cityname = scan.nextLine();  //Mc LeanEnter

        System.out.println("Enter your state");
        String state = scan.next(); //VA

        System.out.println("Enter your zip code");
        String zipCode = scan.next(); //22012

        scan.nextLine(); //EnterEnter

        System.out.println("Enter country name");
        String countryName = scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityname = " + cityname);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);


        scan.close ();



        /*
        1. Enter your full name             nextLine ()
        2. Enter your building number       next ()
        3. Enter your street name           nextLine ()  //Just one time I will use nextLine after the other methot
        4. Enter your city name             nextLine ()
        5. Enter your state                 next ()
        6. Enter your zip code              next ()

        display the shipping address...
         */

    }
}
