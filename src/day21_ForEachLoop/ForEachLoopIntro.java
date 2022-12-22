package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

            int []numbers = {1,2,3};

            for (int each : numbers){
                System.out.print(each);
            }
        System.out.println();
        System.out.println("-----------------------------------------------");


            int [] numbers2 = {10,20,30,40,50,60,70};

                for (int i = 0; i < numbers2.length; i++) { // i: indexes of the array

                    int eachElement = numbers2[i];
                    System.out.print(eachElement + " ");

        }
        System.out.println();
        System.out.println("---------------------------------");

                for (int each : numbers2){

                    System.out.print(each + " ");
                }


    }
}
