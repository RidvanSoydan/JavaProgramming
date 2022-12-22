package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // find the max number between 100  ~ 200

        int maxNumber= max (100,200); //We are able to assign method to a variable which means method is returning value...

        System.out.println("Max number : " + maxNumber); //200

        // multiply max number by 2

        int multiplication = maxNumber * 2;
        System.out.println("Multiplication : " + multiplication); //400

    }


    public static int max (int num1, int num2){

        int result = 0;

        if (num1 > num2){
          result = num1;
        }else {
          result = num2;
        }
        return result;      //return statement...just like break, continue and System.exit(0)...
}





}
