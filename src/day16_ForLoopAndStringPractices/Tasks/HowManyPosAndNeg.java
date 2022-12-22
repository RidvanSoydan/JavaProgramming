package day16_ForLoopAndStringPractices.Tasks;

import java.util.Scanner;

public class HowManyPosAndNeg {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num >=0){
                numberOfPositives++;
            }
            if (num < 0){
                numberOfNegatives++;
            }

            }
        System.out.println("numberOfNegatives = " + numberOfNegatives);
        System.out.println("numberOfPositives = " + numberOfPositives);

        scan.close();
        }




        /*Write a program that asks user to enter number for 5 times, and print how many
        positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

         */

    }

