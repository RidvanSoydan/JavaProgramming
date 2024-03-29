package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList <> ();

        // create 100 pizza objects: size S, cheese topping 2, pepperoni topping 3
        // create 100 pizza objects: size M, cheese topping 3, pepperoni topping 4
        // create 100 pizza objects: size L, cheese topping 4, pepperoni topping 5


        for (int i = 0; i < 100; i++){

            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);

            // 300 hundred pizza objects will be created

        pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));

        }

        System.out.println("Total number of pizza : " + pizzas.size()); // 300


        double totalPrice = 0;

        for (Pizza each : pizzas) { // This for each loop will run 300 times

            totalPrice += each.calculateCost();

        }

        System.out.println("totalPrice = " + totalPrice); // totalPrice = 7800.0



    }
}
