package day32_Constructors_Overloading_Calls;

public class Test {
                        // Constructor Chaining
    public Test (){
        System.out.println("A");
    }

    public Test (int a) {  // A   B
        this ();
        System.out.println("B");
    }

    public Test (double a){ // A   B   C
        this (10);
        System.out.println("C");
    }

    public Test (String str){ // A  B  C  D
        this (2.5);
        System.out.println( "D");
    }




    public static void main(String[] args) {

        Test a1 = new Test("Java");
        System.out.println("a1 = " + a1);

    }

}
