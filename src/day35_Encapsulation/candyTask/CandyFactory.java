package day35_Encapsulation.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {
        
        ArrayList<Candy> candies = new ArrayList<>();
        
        candies.addAll(Arrays.asList(
                new Candy("M&M", 60, 1.5, false),
                new Candy("N&N", 50, 0.0, false),
                new Candy("K&K", 40, 2.5, false),
                new Candy("T&T", 30, 3.5, false),
                new Candy("R&R", 20, 2.75, false)
        ));

        System.out.println("candies = " + candies);


        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+ " : "+candy.getPrice());
        }


        for (Candy eachCandy : candies) {
            System.out.println(eachCandy.calcCost());
            
        }


    }


}
/*

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */