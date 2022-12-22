package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        /*
  Operator        Name                    Meaning
    +       Unary Plus Operator        Indicates positive value  (optional)
    -       Unary Minus Operator       Negates an expression or value (mandatory)
    ++      Increment Operator         Increments a value by 1 (loops topic will see a lot)
    --      Decrement Operator         Decrements a value by 1 (loops topic will see a lot)

 */

        int num1 = +25; // By default java will take it positive, this operator (+) is optional
        int num2 = -25; // It is mandatory, you must use (-) operator.

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true

        /*UNARY Operators
        1. (+)Unary Plus Operator
        2. (-)Unary Minus Operator
        3. (++)Increment Operator
                =Pre Increment
                =Post Increment
        4. (--)Decrement Operator
                =Post Decrement
                =Post Decrement
        */

        //Pre Increment/Decrement operators are placed BEFORE the values of variable
        // ++: increase the value by 1.
        // -- : decreases the value by 1.

        int a = 5;
        ++a; // pre increment : increases the value by 1 right away/immediately (pre decrement hemen yapar)

        System.out.println(a);

        --a; // pre decrement : decreases the value by 1 right away/immediately (pre decrement hemen yapar)

        System.out.println(a);

        // Post Increment/Decrement operators are placed AFTER the values of variable (hemen değiştirmez)
        // Old value of the variable will be used first before increases/decreases the value by 1 in the memory
        //It will paste the current value before changing it
        //Önce mevcut değeri yazar, ikinci adımda 1 eksiğini ya da 1 fazlasını yazar

        System.out.println("------------");

        int b = 100;

        System.out.println(++b); //pre increment : increases the value by 1 immediately

        int c = 100;

        System.out.println(c++); //post increment = it pasted the current value // result is 100, it will do next step
        System.out.println(c); // result 101, it does it now

        // post increment has two steps;  first passes the current value and then increases the value by 1.

        System.out.println("-------------------------------------------");

        int x = 200;

        System.out.println(--x); //pre decrement operator ; result 199

        int y = 200;

        System.out.println(y--); //200 //post decrement first passes the current value then second step (whenever I use y) decreases the value by 1
        System.out.println(y); // 199

        System.out.println("--------------------");

    int z =45;
        System.out.println(++z); //result is 46, z = 46
        System.out.println(z++); //result is 46 but real value is z = 47
        System.out.println(z); //47


    int q = 30;

        System.out.println(--q); //result 29, q = 29
        System.out.println(q--); //result is 29 but real value is q = 28
        System.out.println(q); //28
    }
}

