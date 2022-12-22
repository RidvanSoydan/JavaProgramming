package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char [] letters = new char[26];

        //letters [0] = 'A';
        //letters [1] = 'B';


        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {
                                                                        //i : index numbers 0 ~ last index
                                                                        //j : characters from A to Z
            letters [i] = (char) j;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("---------------------------------------");

        char ch = 'A';

        for (int i = 0; i < letters.length; i++) {

            letters [i] = ch++;
            //ch++;

        } System.out.println(Arrays.toString(letters));

        System.out.println("------------------------------------------------");

        char [] letters2 = new char[26]; //Z ~ A

        for (int i = 0, j = 'Z'; i < letters2.length ; i++, j--) {
            letters2[i] = (char) j;

        }System.out.println(Arrays.toString(letters2));




    }
}
