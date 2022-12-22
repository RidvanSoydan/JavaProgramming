package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {


    public static void main(String[] args) {


      //  System.out.println(ProtectedAccessModifier.name1); error -- default is not visible
          System.out.println(ProtectedAccessModifier.name2); // protected is visible in subclass outside package

     //   AccessModifiers_Test4.method1();    error -- default is not visible
          AccessModifiers_Test4.method2(); // protected is visible in subclass outside package


    }
}
