package day01_JavaIntro;

import day24_CustomMethods_Return.FreeTasks.FirstAndLastCharsExchanged;
import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethod_RemoveDuplicateChars;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {


        String str = "aalıou";

        String newStr = ReturnMethod_RemoveDuplicateChars.removeDuplicates(str);

        System.out.println(newStr);

        System.out.println("---------------------------------------------------");



        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

        System.out.println("---------------------------------------------------");



        String str1 = "Wooden Spoon";

        StringUtility.printEachChar(str1);
    }

}
