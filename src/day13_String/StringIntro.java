package day13_String;

//you must import any class from other packages in order to use...But for String class it is made by implicitly (compiler do it for you)
//import java.lang.String; // I could do like this by manually but no need to do this, compiler makes for us

public class StringIntro {

    //Ever single class has methods that the objects can be used...
    //String package: presented in "java.lang" package
    //Any class in "java.lang" package can be imported implicitly, you dont have to do it by yourself
    //We dont have to use import statement
    //If you write scanner without import statement it will give error...
    // String class is designed for char sequences in java,
    //Char sequences: Combination of multiple characters.
    //65.000 etc char characters, if you want to combine these characters  then we can create String, if you have more than one characters
    //In order to use Class we need create objects than we can use Class
    //String Class means it can contains any text==> "Cydeo" (object), "Java" ==> Object;
    // String Class allow me to have those objects


    //An object that represents sequences of characters, That means every character inside the double quotes are character,

        // All of the characters have number ==> Index Number
    //Index numbers : Starts from 0 (from left)
            //Cydeo
            //01234 == Index Number: How many index number, same with how many character, space is also character...

    //String is immutable (cannot be changed), once the object created it cant be Modified.

    //There are two ways to create String Object;

            //1.By String literal (%95)::Created by using double quotes, Created in the special memory called String pool (special memory location, inside heap (for objects).
                //An allocation of memory in Java heap memory, If the string already exists in the pool, a
                                                                //reference to the pooled instance is returned
    //**String name = "Wooden Spoon" ==> This String not stays in intellj, stays in the Java Heap.
    //All the objects, that you created in java, are stored in heap ==
    // Local variables (inside main methods curly braces) stored in Stack.. ((Wooden Spoon in heap, name in stack)

            //String str1 = "Java"
            //String str2 = "Java" == > Same characters in same order, there will be one "Java" in heap memory

                                // == > But in Stack there will be two variables == str1 and str2

    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon"; // Just one object in heap memory...
        String name4 = "Wooden Spoon";

        System.out.println(name == name2); //True
        System.out.println(name == name3); //True
        System.out.println(name3 == name4);//True


            //2.By new keyword (%5) == > Creates new different object in the heap ==> String variable = new String ();

                // String str1 = new String ("Java");
                //String str2 = new String ("Java");
                    //==> These will create new Java objects inside heap but not inside String Pool,
                    //    these ("Java")'s not same with "Java"s which were created by String literal.
                    //    Because they are stored in different memory locations although they had same sequences of characters in same order

        System.out.println("----------------------");

        String str1 = new String ("Wooden Spoon");
        String str2 = new String ("Wooden Spoon");
        String str3 = new String ("Wooden Spoon");
        String str4 = new String ("Wooden Spoon"); //These are different objects, every new means different objects

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //false
        System.out.println(str2 == str3); //false

        System.out.println("----------------------------------");

        //*********Comparing Visible Tags of Two Strings

        String s1 = "Java";
        String s2 = new String("Java");

        //if you want to compare just the sequences of characters not the objects, you must use equals method...
        //from now on do not use == character when it comes to compare objects,
        // every single object in java has this equals method,
        // designed for comparing values of the objects


        //equals method just look the values...

        System.out.println(s1.equals(s2)); //True

        String s3 = "Java";
        String s4 = new String ("java");

        System.out.println(s3.equals(s4)); //False






    }
}