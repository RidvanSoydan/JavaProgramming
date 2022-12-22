package day08_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {


    public static void main(String[] args) {

        System.out.println( true == !false); //true
        System.out.println(!true != false);  // false
        System.out.println(!false == true);  //true
        System.out.println(!!false); //false
        System.out.println(!!!true);//false             //Usually you dont see like this
        System.out.println("---------------------------------------");

        int score = 85; // 0 ~ 100
                                    // 5 possible outcomes we have, so will create 5 single if statement

        boolean a = score >=90 && score <= 100; // false
        boolean b = score >= 80 && score <= 89; // true

        // another way ==>
        // boolean b = score >=80 && score !a;   (80 den büyük ama a değilse)

        boolean c = score >=70 && score <= 79; //false
        //another way ==> boolean c = !a && !b && score >= 70

        boolean d = score >60 && score <= 69; //false
        boolean f = score <= 59 && score >= 0; //false
        // boolean f = !a && !b && !c && !d && score <= 0

        if (a) { // if the student made A
            System.out.println("Excellent");
        }                                           //Creating the conditions is most challenging part for if statements
                                                    // This is the key of the if statement
        if (b) { // if the student made B           //this if statements all about creating boolean expressions
            System.out.println("Great");            // first thing is to create correct boolean expression
        }                                           //otherwise your code will give bug
                                                    // This is harder way, tomorrow we will learn easy way
        if (c) { // if the student made C
            System.out.println("Good");
        }

        if (d) { // if the student made D
            System.out.println("Passed");
        }

        if (f) { // if the student made F
            System.out.println("Failed");
        }

/*score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */

    }
}
