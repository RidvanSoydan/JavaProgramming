package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {   // Classes can be static but there has to be nested classes
                               // Outer class can not be static, there is no way

    int a; //Inner static class wont accept instance variable

    static class class1 { // default access modifier //
                          //  inner class can be static, static means it has to belong a class

    }

    public static int num = 100;

    public static void method (){

    }

    static {

    }

}


class A { // Outer class

    static class B { // Inner class

        public static void method1 (){

        }

    }

}

class C {
    public static void main(String[] args) {
        A.B.method1();    //First call outer class, then inner class, then method
    }

}


class X {                       // Only class Q can be static....

}
class Y {

}
class Z {
    static class Q {

    }
}