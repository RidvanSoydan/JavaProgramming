package day32_Constructors_Overloading_Calls;

public class ConstructorCalls {


    public ConstructorCalls (){
    //  this (4) ==> error ==> constructor cannot contain itself.
        System.out.println("Default Constructor"); // Default Constructor
    }


    public ConstructorCalls (int a){
        this ();
        System.out.println("Constructor with int parameter");
    //  this (); error ==> must be in the first step
    }

    public ConstructorCalls (String str){
     // this (); // error ==> cannot be two call
        this (10);
        System.out.println("Constructor with String parameter");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(); //  Default Constructor

        System.out.println("---------------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10); // Default Constructor
                                                             // Constructor with int parameter

        System.out.println("--------------------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("str"); // Default Constructor
                                                             // Constructor with int parameter
                                                             // Constructor with String parameter




    }







}
