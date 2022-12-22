package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        System.out.println("Please Enter Your First Name");

        String firstName = "rıDVAN", lastName = "SOYDAN";

        firstName = firstName.substring (0,1).toUpperCase() + firstName.substring(1).toLowerCase();
                    // R                                    + ıdvan
//Another Way==> firstName = ("" + firstName.charAt (0)).toUpperCase() + firstName.substring(1).toLowerCase();
                             //making char to String, by using concatenation and () ==>prioritising with paranthesis...
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
                    //S                                  + oydan

        System.out.println(firstName + " " +lastName);



        /*3. Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character in upper case)

        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";

        output:
        Cydeo School
*/


    }
}
