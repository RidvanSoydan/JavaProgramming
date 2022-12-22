package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        //isEmpty () method... checks if the lenght of the string 0, if there is no character in string, it is empty
            //if there is space it is not empty, it is blank
            //Returns True or False

        String str = ""; // this is empty, but " " this is not empty, this is blank.

        boolean risEmptyOrNot = str.isEmpty(); //True
        boolean rBlankOrNot = str.isBlank();//True
        System.out.println("risEmptyOrNot = " + risEmptyOrNot);
        System.out.println("rBlankOrNot = " + rBlankOrNot);

        //isBlank () method... ==>checks if there is only space or not, space is also character. Returns True or False
            //if there is characters in string except for space, this method returns false....

        String str2 = " ";
        boolean risBlankOrNot = str2.isBlank(); //True
        System.out.println("risBlankOrNot = " + risBlankOrNot);

        String str3 = "Rrr          ";
        boolean risBlankOrNot2 = str3.isBlank(); //False

        System.out.println("----------------------");

        //equals () method==> in order to compare strings with looking for the case sensivity
        // equalsIgnoreCase () ==> in order compare characters by ignoring lower or upper cases (without case sensivity)

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        ///yes, YES, Yes, YEs....

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("------------------------------");

        //contains () ==> compares some parts of string, equals () method compare whole part of string with case sensivity...

        String sentence = "My favourite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); //false
        boolean hasJava = sentence.contains("Java"); //true
        boolean hasJava2 = sentence.contains("java"); //false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); //to be able to ignore case sensivity...
        boolean r3 = sentence.contains("java")|| sentence.contains("Java");//jAvA
        
        
        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);


        System.out.println("----------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //False
        System.out.println(input1.equalsIgnoreCase(input2)); //False
        System.out.println(input1.contains(input2));//True

        //to be able to ignore case sensivity...

        System.out.println(input1.toLowerCase().contains("java")); //True
        System.out.println(input1.toUpperCase().contains("JAVA")); //True


        System.out.println("---------------------------------");

        //startWith () .... endsWith ();
        String a = "Wooden Spoon";
        boolean x = a.startsWith("oo");
        boolean y = a.endsWith("oon");
        boolean z = a.toLowerCase().startsWith("wooden"); //to be able to ignore case sensivity
            //in order to ignore the case sensivity we first create the lower case or upper case version of string and then 
            // compare it with lower case or upper case...
        
        System.out.println("x = " + x); //False
        System.out.println("y = " + y); //True
        System.out.println("z = " + z);//True








        

    }
}
