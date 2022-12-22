package day09_IfStatements.__homeWork;

public class ChooseLanguage {

    public static void main (String [] args) {

        /*3. Creata a class called ChooseLanguage, Given an integer variable named
            selection that has a number between 1~5, Write a program that can
            select the language based on the number that's given in selection and
            prints the following message:
            for 1: Hello, thank for your call
            for 2: Hola, gracias para llamar
            for 3: Merhaba, aradiginiz icin tesekkurler
            for 4: Privet, spasibo za vash zvonok
            for 5: Merci ,pour votre appel

         */

        int number = 3; // 1 ~ 5
        String choosenLanguage;

        if (number == 1) {
            choosenLanguage = "for 1: Hello, thank for your call";

        } else if (number == 2) {
            choosenLanguage = "for 2: Hola, gracias para llamar";

        } else if (number == 3) {
            choosenLanguage = "for 3: Merhaba, aradiginiz icin tesekkurler";

        } else if (number == 4) {
            choosenLanguage = "for 4: Privet, spasibo za vash zvonok";

        } else if (number == 5) {
            choosenLanguage = "for 5: Merci ,pour votre appel";

        } else {
            choosenLanguage = "You typed wrong number, please try again!!";
        }
        System.out.println(choosenLanguage);




    }
}
