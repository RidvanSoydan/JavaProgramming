package day45_Abstraction_Interface;

public interface PropertiesOfInterface {

        int a = 100;  // static & final by default
        static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){ // Cannot have constructor
        this.a =a;
    }
    */

    /*
    static{
        b = 100;
    }
    */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */

        static void method2(){
            System.out.println("Static method");
        }
        //static method will have one copy

        void method3();


        default void method4(){
            System.out.println("Default method");
        }
        // default method is only method that allows implementation in interface,
        // in subclasses default method will be treated as instance
    }

    class Test implements PropertiesOfInterface{ // test class is instance

        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4(); // default method will be treated as instance method in the child class
                                  // Will be called with object

            PropertiesOfInterface.method2(); // static method will be called with class name

        }

    }


