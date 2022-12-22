package day35_Encapsulation.carpetTask;

public class CarpetTest {

    public static void main(String[] args) {


        Carpet carpet = new Carpet(2,3,4, false);

        System.out.println(carpet);// Carpet{width=2.0, length=3.0, unitPrice= $4, isPersian=false, totalCost= $24.0}

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);

        System.out.println(carpet); // Carpet{width=7.0, length=6.0, unitPrice= $8.0, isPersian=true, totalCost= $336.0}



    }

}



/*

Carpet Task

		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */