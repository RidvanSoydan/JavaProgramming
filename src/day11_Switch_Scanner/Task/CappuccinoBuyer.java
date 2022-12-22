package day11_Switch_Scanner.Task;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "venti";
        boolean validSize = size == "tall" || size == "grande" || size == "venti";
        double priceTall = 3.69, priceGrande = 3.99, priceVenti = 4.29;
        int caloriesTall = 90, caloriesGrande = 120, caloriesVenti = 150;

        if (validSize) {

            switch (size) {

                case "tall":
                    System.out.println(size + "\nPrice is $" + priceTall + "\n" + caloriesTall + " calories");
                    break;

                case "grande":
                    System.out.println(size + "\nPrice is $" + priceGrande + "\n" + caloriesGrande + " calories");
                    break;

                default:
                    System.out.println(size + "\nPrice is $" + priceVenti + "\n" + caloriesVenti + " calories");

            }
        } else {
            System.out.println("Invalid Size");
        }

        /*Create a class called  CappuccinoBuyer. A variable named Size is given,
        write a program that can display the price and calories of cappuccino
        Valid sizes are tall, grande, venti and their price & calories are:

        tall:
        price is $3.69
        90 calories
        grande:
        price is $3.99;
        120 calories
        venti:
        price is $4.29
        150 calories

        If the size is invalid then the output should be "Invalid Size"
        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed*/
    }
}
