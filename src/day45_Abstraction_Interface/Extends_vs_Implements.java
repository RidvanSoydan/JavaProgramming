package day45_Abstraction_Interface;


import day44_Abstraction_Interface.animalTask.Animal;
import day44_Abstraction_Interface.animalTask.Cat;
import day44_Abstraction_Interface.animalTask.Dog;

//extends:
    class C{

    }

    class A {

    }

    class B extends A {

    }


    interface Z {

    }

    interface X {


    }

    interface Y extends X, Z{

    }


//implements

    class D implements X, Y, Z{

    }


    public class Extends_vs_Implements extends A implements X, Y, Z{


}
