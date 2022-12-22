package day19_LoopPractices.FreeTasks;

public class ReversedNumberPyramid {

    public static void main(String[] args) {


        for (int i = 7; i > 0; --i) {


            for (int j = i; j > 0 ; --j) {
                System.out.print(j + " ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
        /*Print the following number pyramid

            7 6 5 4 3 2 1 2 3 4 5 6 7
            6 5 4 3 2 1 2 3 4 5 6
            5 4 3 2 1 2 3 4 5
            4 3 2 1 2 3 4
            3 2 1 2 3
            2 1 2
            1


 */



    }
}
