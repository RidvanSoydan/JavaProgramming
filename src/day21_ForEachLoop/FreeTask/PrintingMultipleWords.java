package day21_ForEachLoop.FreeTask;

import java.util.Arrays;

public class PrintingMultipleWords {

    public static void main(String[] args) {

        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words = str.split(", "); //str.split(", ")
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (word.contains(" ")) // condition for multiple words
                System.out.println(word);
        }




        /*

        Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer

         */
    }
}
