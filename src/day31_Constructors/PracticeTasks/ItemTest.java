package day31_Constructors.PracticeTasks;

public class ItemTest {

    public static void main(String[] args) {


        Item item1 = new Item("Black Fabric", 3.5, 100);

        System.out.println(item1); // Item{name='Black Fabric', unitPrice= $3.5, quantity=100, total Price= $350.0}




    }
}
/*
Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()

 */