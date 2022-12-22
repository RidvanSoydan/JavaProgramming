package day23_CustomMethods_Void.Tasks;

public class PrintEachElement {

    public static void main(String[] args) {

        int [] nums = {1,2,3};

        eachElementOfArray(nums);

    }


    public static void eachElementOfArray (int[] numbers) {


        for (int number : numbers) {
            System.out.println(number);
        }

    }

}

//create a method named printEachElement that can print each elements of an integer array