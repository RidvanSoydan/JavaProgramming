package day12_Scanner.PracticeTasks;

import java.util.Scanner;

public class CalculateCarTax {

        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your car price : ");

            int price = scan.nextInt();
            double taxRate=0.00;

            if (price>=20_000 ) {

                if (price >= 20_000 && price <= 39_999) {
                    taxRate = price *0.2;

                } else if (price >= 40_000 && price <= 59_999) {
                    taxRate =price* 0.3;

                } else if (price >= 60_000 && price <= 80_000) {
                    taxRate = price* 0.4;

                } else {
                    taxRate = price*0.6;
                }
                System.out.println("Price : £"+price+"\ntaxRate : £"+taxRate+"\nTotal Payment : £"+(price+taxRate));
            }
            else {
                System.out.println("Invalid");
            }

            scan.close();
        }
    }

