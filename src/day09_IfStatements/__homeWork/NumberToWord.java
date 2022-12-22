package day09_IfStatements.__homeWork;

public class NumberToWord {

    public static void main(String[] args) {
        /* 1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
            Ex:
            number = 1;
            output:
            One
         */

        int number = 7; // 1 ~ 9
        String numberToWord;

        if (number == 1) {
            numberToWord = "One";
        } else if (number == 2) {
            numberToWord = "Two";
        } else if ( number == 3) {
            numberToWord = "Three";
        } else if (number == 4) {
            numberToWord = "Four";
        } else if( number == 5) {
            numberToWord = "Five";
        } else if ( number == 6) {
            numberToWord = "Six";
        } else if ( number == 7) {
            numberToWord = "Seven";
        } else if( number == 8) {
            numberToWord = "Eight";
        } else if( number == 9) {
            numberToWord = "Nine";
        } else {
           numberToWord = "You MUST write a number between 1 ~ 9";
        }

        System.out.println(number + " : " + numberToWord);





    }
}
