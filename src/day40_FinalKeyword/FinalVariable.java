package day40_FinalKeyword;

public class FinalVariable {

        final String birthDay;
        final static String name;

        static{
            name = "Batch 25";
        }

        public FinalVariable(String birthDay) {
            this.birthDay = birthDay;
        }


        public static void main(String[] args ) {

            final double pi = 3.14;

            //pi = 4.14; final variables can not be reassigned.
            // pi = 5.4;

            System.out.println(pi);

            final String name;

            name = "Java";

            // name = "Wooden Spoon"; Error

            System.out.println(name);

            System.out.println("----------------------------------------");

            FinalVariable obj = new FinalVariable("May/01");

            //obj.birthDay = "June/01"; // final variables can not be reassigned.

            System.out.println(obj.birthDay); // May/01

            System.out.println("----------------------------------------");

            // FinalVariable.name = "Python";

            System.out.println(FinalVariable.name); // Batch 25

        }

    }
