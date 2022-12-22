package day08_IfStatements;

public class C_SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // c = 15, c is containing b's original value.
    //----------------------------------------------------------------
        b = a; // b = 10, I assigned a's value to b, old value of b will be gone
        // a = b; // b value has gone so I cannot do this instead of this 1 can do like this by assigning b's value to the c (temporary variable)
        a = c ; // you have to assign a temporary variable
        //This how you can swap two variable by using temporary variable
    // ----------------------------------------------------------------
        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10


/*write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */

        System.out.println("----------------------------------------------");









    }


}
