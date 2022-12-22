package day09_IfStatements;

public class MinNumber_SingleIf {

public static void main (String [] args){

                                //how many possibility you have, you need to create so many single if statement
    int n1 = 300;
    int n2 = 100;

    boolean n1IsMin = n1 < n2;
    boolean n2IsMin = n1 > n2;
    boolean equal = n1 == n2;

    if (n1IsMin) {  //if n1 is the minimum number
                    // in future we dont need to use boolean we will write the expressions like this "if (n1 > n2) {}"

        System.out.println(n1 + " is minimum number ");
    }

    if (n2IsMin) { //if n2 is the minimum number

        System.out.println(n2 + " is minimum number");
    }

    if (equal) { //if n1 is equal to n2
        System.out.println(n1 + " is equal to " + n2);
    }
        //which one the statement/if block get printed/executed? How do I know?
        //It depending on the boolean expressions, whichever is true, it will get executed

/*Warmup tasks:
	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal



 */




}


}
