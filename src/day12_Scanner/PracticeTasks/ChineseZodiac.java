package day12_Scanner.PracticeTasks;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please Enter Your Birth Year");

            int year = input.nextInt();
            String result ="";

            switch (year % 12) {
                case 0 : result = "Monkey"; break;
                case 1 : result = "rooster"; break;
                case 2 : result = "dog"; break;
                case 3 : result = "pig"; break;
                case 4 : result = "rat"; break;
                case 5 : result = "ox"; break;
                case 6 : result = "tiger"; break;
                case 7 : result = "rabbit"; break;
                case 8 : result = "dragon"; break;
                case 9 : result = "snake"; break;
                case 10 : result = "horse"; break;
                case 11 : result = "sheep"; break;
            }
            System.out.println(result);
        }


        /*
        these are Chinese Zodiac. write a program to find out the Chinese Zodiac sign for your birth year.
        use Scanner class and switch statement.
        The Chinese Zodiac is based on a 12-year cycle, with each year represented by an animal
         */
    }

