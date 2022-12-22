package day23_CustomMethods_Void.Tasks;

public class PrintEachCharacters {

    public static void main(String[] args) {

        eachCharacters("Ali topu tut");
    }

    public static void eachCharacters (String str){


        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }
}
    //create a method named printEachChar that can print each characters of a string