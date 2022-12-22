package day04_Variables;

public class A_PrimitivesIntro {



    public static void main(String[] args) {

        // integers numericals tam sayılar
        // age : 33 years old

        byte x = 38;
        byte age = 38;

        //weight ; 160 pound
        //byte weight = 160; 160 is out of byte range, gave error.
        // -129 is also out of byte range...

        short weight = 160; // 160 is within the range of short.

        //***** 100 is within short and byte range, because of memory usage we use byte****

        short weightt = 100;


        // salary : 100000 €
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000;      //int is PREFERRED DATA TYPE FOR INTEGER NUMBER...
        //to make it readable can use _ not,

        long asset = 3_333_333_333L; //(varlık, mal-mülk)

        /* you have to specify by using L/l this number is in the range of long,
         if dont it will give compile error.
         Compiler takes always int when you have integer
          */


        // decimal number (ondalık)
        // TAX : 0.26

        float tax = 0.26F;

        double PI = 3.14;

        //double is preferred one according to float, you have to write F to make

        // double > float > long > int > short > byte
        //DOUBLE and INT, preferred ones

    //#
    char ch1 = '#'; // you have to write within the single code (' ')
        System.out.println("ch1 = " + ch1);

        // another way look ascii table and look the number of the char

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        // char from 0 to 65535

        char ch3 = 65535;
        System.out.println("ch3 = " + ch3);

        char ch4 = 254;
        System.out.println("ch4 = " + ch4);
        //GRADE, GENDER, DAY OR NIGHT, S-W-N-E,,,
        char gender = 'M';
        char grade = 'B'; // A, B, C, D, F.

        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);

        char Yes_No = 'Y';
        System.out.println("Yes_No = " + Yes_No);

        // you dont need to memorize all the ascii table...
        // you cant write like this "char ch3 = 'AB' " ==== so blood type cannot be written


        // BOOLEAN === BOOLEAN
        // only accepts true or false

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);

    String name = "Rıdvan Soydan";
    String city = "Afyon";
    String country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);

        String first_name$ = "Ridvan Soydan";
        int num1 = 12;

        System.out.println("num1 = " + num1);
        System.out.println("first_name$ = " + first_name$);


        // just you can use a-z, A-z, _ and $ in the variable names
        //After first character you can use a-z, A-Z, the digits (rakamlar), _ , $
        //cant include space
        //cant start with digits
        //cant use Java Reserved Words, boolean, int, private, super, true ......
        //one variable name can be used one variable, cant be multiplied, duplicated...







    }



}
