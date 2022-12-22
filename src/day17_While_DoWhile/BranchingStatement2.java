package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i == 'C'){
                continue; // it will print A and B then skips C then prints D and E
            }

            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("-------------------------------------");

        //Print all even and odd numbers....

        for (int i = 1; i <= 100; i++) { // i : 1, 2, 3, 4, 5, 6, 7, 8,...100

            if (i % 2 != 0){ // 1, 3, 5, 7 ...
                continue; // skip
            }

            System.out.print(i + " ");
        }
        System.out.println("------------------------------------");

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
