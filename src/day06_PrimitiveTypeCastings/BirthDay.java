package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main (String[] args) {

        /*Warmup tasks
	1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995 */

       String name = "Rıdvan Soydan";
       int birthDay= 07;
       String birthMonth = "January";
       int birthYear = 1989;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("----------------------------");

        //My favourite book is "bookName" double quote reserved for string of text so you need use backward slash and double quote
        //  \n  \t  \"  \' Escape Sequences
        String bookName = "Suç ve Ceza";

        System.out.println("My favourite book is \"" + bookName + "\"");
        System.out.println("My favourite book is " + "'" + bookName + "'");

    }


}
