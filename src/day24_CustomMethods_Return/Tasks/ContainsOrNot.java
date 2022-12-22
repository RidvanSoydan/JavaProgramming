package day24_CustomMethods_Return.Tasks;

public class ContainsOrNot {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int num =5;

        boolean containingNumOrNot = containsOrNot(arr, num);
        System.out.println("containingNumOrNot = " + containingNumOrNot);
    }

    public static boolean containsOrNot (int [] arr, int number){

        boolean containNumOrNot = false;

        for (int each: arr) {

            if (each == number)
                containNumOrNot = true;

        }
        return containNumOrNot;
    }

}
/*
        Create a method named contains that passes one integer array and one integer parameters,
	    the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */