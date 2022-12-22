package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        /*  1. Create a class called ShippingAddress.java
            2. Declare the following variables:
                1. name
                2. buildingNumber
                3. streetName
                4. city
                5. state
                6. zipCode
                3. Use concatenation to print the full address

         */


        String name = "Rıdvan Soydan";
        String buildingnumber = "11";
        String streetname = "Menderes";
        String city = "Afyon";
        String state = "Turkey";
        String zipcode = "A 03000";

        System.out.println(name + "\n" + buildingnumber + " " + streetname + "\n"  + city + ", " + state + " " + zipcode);
        System.out.println();

        //All concatenations turns you STRING value so you can do string variables for address

        String address = name + "\n" + buildingnumber + " " + streetname + "\n"  + city + ", " + state + " " + zipcode;
        System.out.println(address);



        // ANOTHER OPTION, BY USING COMMA (,) WHEN
        /*
        String name = "Rıdvan Soydan",
                buildingNumber = "11",
                streetName = "Menderes",
                city = "Afyon",
                state = "Turkey",
                zip code = "A 03000";

         */ // ALL THIS DATA IS SHARING SAME DATA TYPE...


    }



}
