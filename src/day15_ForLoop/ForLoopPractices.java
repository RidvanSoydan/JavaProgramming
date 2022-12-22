package day15_ForLoop;


public class ForLoopPractices {

    public static void main(String[] args) {

        // in the same line with a space between them
        // 15 16 17 ..... 45

        for (int i = 15; i <= 45; i ++ ) /* another way for iteration ==> i += 1 */ {

            System.out.print(i + " ");
            System.out.print(" **** ");
            // i is local variable of for this loop block, outside this block I cannot call same i anymore...
            System.out.println(" Hello ");
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("----------------");
        // 100 99 98 ...50

        for (int i = 100; i >= 50; i--) { // relational operators (>=, <=, >, <) will be used usually for for loop
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("****************");

        //print all the even numbers between 1 ~ 55

        for (int i = 1; i<=55; i++) {
              if (i % 2 == 0){
            System.out.print(i + " ");

            }
        }
        System.out.println();


    }
}
