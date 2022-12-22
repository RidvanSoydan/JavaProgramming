package day17_While_DoWhile.Task;

import java.util.Scanner;

public class DivisibleBy3And5And15 {


    public static void main(String[] args) {

        System.out.println ("Enter a number");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        int i = 1;
        while (i <= num) {

            if (i % 15 == 0) {

                divisibleBy15 += i + " ";
                i++;

            } else{i++;}
        }
        i = 1;

        while (i <= num) {

            if (i % 5 == 0 && i % 3 != 0) {

                divisibleBy5 += i + " ";
                i++;

            } else{i++;}
        }
        i = 1;

        while (i <= num) {

            if (i % 3 == 0 && i % 5 != 0) {
                divisibleBy3 += i + " ";
                i++;
            }
            else{i++;}
        }
        System.out.println("divisableBy15 : " + divisibleBy15);
        System.out.println("divisableBy5 = " + divisibleBy5);
        System.out.println("divisableBy3 = " + divisibleBy3);


//ANOTHER WAY

        System.out.println();
        System.out.println("************************************");
        System.out.println("Enter a number");

                int number = scan.nextInt();

                String divBy3 = "";
                String divBy5 = "";
                String divBy15 = "";

                for (int j = 1; j <= number; i++) {

                if (j % 3 == 0 && j % 5 !=0){
                divisibleBy3 += j + " ";
                }

                if (j % 5 == 0 && j % 3 !=0){
                divisibleBy5 += j + " ";
                }

                if (j % 15 ==0 && (j%3 !=0 && j%5 !=0)){
                divisibleBy15 += j + " ";
                }
                }

                System.out.println("divisibleBy15 = " + divisibleBy15);
                System.out.println("divisibleBy5 = " + divisibleBy5);
                System.out.println("divisibleBy3 = " + divisibleBy3);



                scan.close();

    }
}




        /*Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15 15 30 45 60 75 90
	                     Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                     Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

         */

