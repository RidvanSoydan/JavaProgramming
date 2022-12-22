package day03_EscapeSequences;

//  Escape Sequences       Mus be given double quotes ("")
//  \n  Newline            Advances the cursor to the next line for subsequent printing, starts a new line
//  \t  Horizontal Tab     Causes the cursor to skip over to the next tab stop,  paragraph space, (tab)
//  \\  Backslash          Causes a backslash to be printed, prints one back slash
//  \"  Double quote       Causes a double quotation mark to be printed

public class A_EscapeSequences {


    public static void main(String[] args) {


        System.out.println("Java \nPyhton \nJavaScripts");
        System.out.println("Hello everyone \nhow are you all today \ntoday we learned println and print \nnext week we will learn variables");

        System.out.println("----------------");
        System.out.println("    Java is cool programming language");
        System.out.println("\tJava is cool programming language");


        System.out.println("--------");
        System.out.println("/ \\");
        System.out.println("/ \\\\"); //in order to print one backward slash we need to give two backward slashes

        System.out.println("-----------");
        System.out.println("My favorite team is \"Fenerbahce\"");//in order to print " we need to use \"



    }


}
