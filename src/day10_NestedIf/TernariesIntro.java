package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

            /*Ternaries: shortcut of if statement
            It does the same thing with the if statement, just shortcut
            Ternaries can be used whenever the if block printing with same value and same data type
            In ternaries you dont need to use curly braces, it returns you with one value
            ****If the if blocks returns you more than one value you CANNOT use ternaries
            ****If one if block returns String, the other returns Primitives you CANNOT use ternaries (different data types)

            Ternaries is LIMITED, IF statements NOT LIMITED

            **Ternaries is data, you cannot just directly write data, it needs to be either initialised to variable
                or passed in the print statement

            ** Total number of the colons and question marks must be equal if not there will error

            ****Paranthesis is optional in Ternaries but Using Paranthesis is important to make the condition readable

 	if          :        (Condition)?  Value        (normally if (condition) { value }        )
 	else        :                   :  Value        (normally else { value }                  )
 	else if     :       :(Condition)?  Value        (normally else if (condition) { value }   )

         */

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // String

        }else {
            System.out.println("Odd"); //String
        }                               //Both of them is String

        System.out.println("---------------------------------------------");

        String result1 = (n %2 == 0)? "Even" : "Odd"; // Means if the inside paranthesis is true n is even, otherwise (:) n is odd
        System.out.println(result1);

        System.out.println("--------------------------------------------------");

        //if eligible to buy ALCOHOL

        int age = 17;

        if (age >= 21) {
            System.out.println("Eligible"); //String
        }else {
            System.out.println("Not Eligible"); //String
        }
        System.out.println("---------------------------------------------");

        //In the example above every single if block returning the same value with same data type

        String result2 = (age >= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println ((age >= 21)? "Eligible" : "Not Eligible"); // same thing with the above

        System.out.println("-----------------------------------------------");

        //Ternaries with else if

        int number = -25;

        if (number >0 ){
            System.out.println("Positive"); // Same data type : String
        } else if (number < 0){
            System.out.println("Negative"); // Same data type :
        } else {
            System.out.println("Zero");
        }

        // SAME WITH THE ABOVE

        String result3 = (number > 0)? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result3);

        //Same with the Above

        System.out.println ((number > 0)? "Positive" : (number < 0) ? "Negative" : "Zero");



    }
}
