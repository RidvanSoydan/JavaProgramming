package day13_String;

public class StringMethods {

    public static void main(String[] args) {


        String word = "Cydeo";
        //index     =  01234

        char thirdChar = word.charAt(3); // what character is in the 3. index number

        System.out.println("thirdChar = " + thirdChar);

        
        char tenthChar = word.charAt(0);
        System.out.println("tenthChar = " + tenthChar); // result ==> index out of bounds exception
                                                        // if the index number does not exist..

        System.out.println("---------------------------------------");

        ///********  lenght () methods ==> Returns the total number of the characters, returns int

        String s1 = "Batch 25 is the best batch."; ///Spaces are also character...

        int totalNumberOfCharacters = s1.length();
        System.out.println("totalNumberOfCharacters = " + totalNumberOfCharacters);

        char lastChar = s1.charAt(s1.length()-1); // s1.lenght()-1 ==> in order to find last index number,
                                                  // s1.charAt (s1.lenght()-1) means what is the character on the last index number

        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------");

        ///************ toLowerCase () and toUpperCase()
                          // String cannot be modified so when you call this methods
                         // you cannot change String but you can create new one.


        String str = "wooden spoon";

        str = str.toUpperCase(); //what if I want to WOODEN SPOON object printed; (if you want with same variable)
                                // You must assign it str variable back if you want to take upper case result

        System.out.println("str = " + str);

        System.out.println("--------------");

        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println("s = " + s);
        System.out.println("------------------------------");

        //Today is a great day to learn java programming language.

        String sentence = "Today is a great day to learn java programming language.";

        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);


    }
}
