package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

     /*     Description                  Operator
            Greater than                    >           //used only to compare the NUMBERS, NUMERICAL VALUES
            Greater than or equal           >=          //used only to compare the NUMBERS, NUMERICAL VALUES
            Less than                       <           //used only to compare the NUMBERS, NUMERICAL VALUES
            Less than or equal              <=          //used only to compare the NUMBERS, NUMERICAL VALUES
            Equal                           ==          //compare two values equal or not, NUMBER and STRING
            Not equal                       !=          //compare two values equal or not, NUMBER and STRING
      */

    /// ALL RELATIONAL OPERATORS RETURN BOOLEAN (TRUE OR FALSE)

   // >, >=, <, <=    ===> For the Numbers

        //Greater Than (>), Greater than or equal (>=)
        boolean result1 = 20 > 40; // false
        boolean result2 = 100 > 40; // true

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        boolean result3= 300 >= 150; // 300 > 150 and 300 = 150; two condition; if one of the conditions is true, result will be true

        System.out.println("result3 = " + result3);

        boolean result4 = 100 >= 100; // 100 > 100, 100 = 100;
        System.out.println("result4 = " + result4);

        boolean result5 = 300 >=500; // none of the conditions true, both are false
        System.out.println("result5 = " + result5);


        // credit score of 720 in order to be eligible

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore>=720; // if the credit score is 720 or greater, then it is eligible for loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        //Less Than (<) or Less Then or equal (<=)

        boolean result6 = 100< 120;
        System.out.println("result6 = " + result6);

        boolean result7 = 200<100;
        System.out.println("result7 = " + result7);


        int score = 59;
        boolean hasFailed = score>=59;
                            // 59 <=59
                            //75<= 59 //if student takes 75 he won't be failed

        System.out.println("hasFailed = " + hasFailed); //true

        boolean result8 = 45 <= 60;
        System.out.println("result8 = " + result8); //true
        System.out.println("-----------------------------------------------");

        // Equal ( == ),   Not equal  ( != )

        //Single equal (=) is used for assign value to variable in JAVA
        // OR means EITHER (YA)
        //These operators CAN BE USED FOR STRING

        int x = 100;
        int y = 200;

        boolean equal = x == y; // false
        //            100 == 200
        System.out.println("equal = " + equal);

        boolean result9 = "Muhtar" == "Good Guy";
        System.out.println("result9 = " + result9); // false
        //Only true result comes if the two values or texts same with the other

        boolean result10= "Java" == "Java";
        System.out.println("result10 = " + result10);

        boolean result11 = "Java" == "Java  "; // Spaces also character so these are not same
        System.out.println("result11 = " + result11); //false

        boolean result12 = 'A' == 'a'; //char
        System.out.println("result12 = " + result12); // false

        boolean result13 = 'b' == 'b';
        System.out.println("result13 = " + result13);//true
        //this is how replit checks our codes

        System.out.println("------------------------------------------");

        //****Not Equal   (!=)

        boolean result14 = 100 !=200.5; //true
        System.out.println("result14 = " + result14);

        boolean resul15 = "Java" != "Break";
        System.out.println("resul15 = " + resul15);//true

        boolean result16 = 300 !=300;
        System.out.println("result16 = " + result16);//false







    }

}
