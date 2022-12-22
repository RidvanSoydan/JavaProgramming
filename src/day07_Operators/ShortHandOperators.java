package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //*****assignment : =  TO UPDATE DATA, (in java assigning, in math equal)

        int number = 100; // I assigned 100 to number variable.

        System.out.println("number = " + number); // 100
        // if I want new value for variable (number) after this line I will assign new value
        // I want to replace 100 to 200;

        // Java executes the codes top to bottom
        // VARIABLES MUST BE UNIQUE, UNIQUE NAME.

        number = 200; // I assigned new value starting from this line, I updated the value.

        System.out.println("number = " + number);
        // I declared just 1 variable but I updated it.

        // int number = 200;
        // If I try to do by giving a data type like above it means you are trying to build a new variable.
        // But name cannot be duplicated so it will give compile error.

        String word = "Java Programming";

        System.out.println("word = " + word); // When was the last time this variable initialized
                                              // Java Programming
        word = "Wooden Spoon";
        System.out.println("word = " + word);   // Wooden Spoon

        // You can use 1 variable with (contain) 1 data, if you dont need this data you can assign new value.

        word = "Cydeo"; // Reassigning...
        System.out.println("word = " + word); // Cydeo

        //You cannot change the DATA TYPE also.
        //So You must now the DATA TYPE..
        // First time variable Word was String so you cannot reassign it integers or decimals...
        // word = 212;  You cannot do it like this
        // word = "212" You can do like this because "123" is not number.

        word = "123" +1;
        System.out.println("word = " + word);

        word = "Java Programming";
        System.out.println("word = " + word);

        // regular variables ==> contain 1 value ... we will see more then 1 values.
        System.out.println("-------------------------------------------------------");

        /*NAME                  SHORTHAND OPERATOR      MEANING
        Assignment                  x = y               x = y
        Addition Assignment         x += y              x = x + y
        Subtraction Assignment      x -= y              x = x – y
        Multiplication Assignment   x *= y              x = x * y
        Division Assignment         x /= y              x = x / y
        Remainder Assignment        x %= y              x = x % y
        */

        //*****Addition Assignment;  // can be used not only integers-decimals but also String

        int x = 100;

        System.out.println("x = " + x);
        System.out.println(x + 200); // 300,  It won't change the value,  x is 100 still

        //x = x + 200;   //new x is 300; Increasing the value of variable
        //We have shortcut for the formula above;

        x +=200; //addition and assignment // x +=200 means x = x + 200

        System.out.println("x = " + x);

        String str = "Wooden"; // you can use addition assignment for String also but it is not addition, it is caocatenation

        str +=" Spoon";
        System.out.println("str = " + str); // Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // num1 = 2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1);  // num1 = 8.0


        double availableBalance = 1000.50;

        // deposit 300 $
        availableBalance += 300; /// means availableBalance = 1000.5 + 300
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("---------------------------------------------");

        //********Addition Assignment HARİCİ HİÇ BİR SHORT HAND OPERATOR STRING'DE KULLANILMAZ*********

        // *****Substraction Assignment

        //withdrawing 500$

        availableBalance -= 500; // availableBalance = 1300.5 - 500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$ then depositing 400$

        availableBalance -=200;
        availableBalance +=400;
        System.out.println("availableBalance = " + availableBalance);

        // *******Multiplication Assignment

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *=2; // after graduation Cydeo Course
        System.out.println("salary = " + salary);

        double doge = 0.00000001;

        doge *= 1000000;
        System.out.println("doge = " + doge);

        System.out.println("-----------------------------------------------------");

        // *******Division Assignment
        double num2 = 25000;
        System.out.println("num2 = " + num2);

        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------------------");

        //****** Remainder Assignment %=

        double num3 = 100;
        System.out.println("num3 = " + num3);
        num3 %=3;
        System.out.println("num3 = " + num3);

        System.out.println("----------------------------");

        int amount = 127; // cents

        int quarters = 127/25; //25 cent değerindeki madeni para
        int cents = 127 % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("---------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------");

        int y = 300;
        System.out.println("y = " + y);
        y %=16;
        System.out.println("y = " + y);
        System.out.println("----------------------------------------");

        int balance = 3500;

        // insurance fee: 153
        balance %= 153;
        System.out.println("balance = " + balance); // after paying couple months left over is 134

///SPOILER::: IN FUTURE WE WILL USE MOSTLY ASSIGNMENT (=), ADDITION ASSIGNMENT (+=) AND SUBSTRACTION ASSIGNMENT (-=)




    }

}
