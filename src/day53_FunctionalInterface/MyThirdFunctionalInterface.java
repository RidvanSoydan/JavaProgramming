package day53_FunctionalInterface;


@FunctionalInterface
public interface MyThirdFunctionalInterface <T> { // T can be any name or letter
                                                  // T is generic, T can be String, Integer ...

    T method (T data); // I want my return type same with T


}

    /*
    2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
    one argument of any type and returns the same type
    */

