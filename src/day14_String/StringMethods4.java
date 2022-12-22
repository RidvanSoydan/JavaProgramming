package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        //repeat () (count) method: repeats the string for given number of times. returns string


        String str = "Cydeo";

        str = str.repeat(4); //CydeoCydeoCydeoCydeo

        System.out.println("str = " + str);


        System.out.println("-------------------------");

        String s1 = "Wooden Spoon ";

        s1 = s1.repeat(100);
        System.out.println("s1 = " + s1);

        System.out.println("*************************");

        System.out.println("FADY\n".repeat(15));

        System.out.println("*********************");

        String name = "Java";
        System.out.println(name.repeat(5));
        System.out.println((name +" ").repeat(5));



    }
}
