package day07_Operators;

public class Castings {


        public static void main (String [] args ) {

            float averageScore = 20.5f;

            byte num1 = (byte) averageScore; // Explicit Casting
            short num2 = (short) averageScore; // Explicit casting
            int num3 = (int) averageScore; //Explicit Casting
            float num4 = averageScore; //There is no CASTING
            double num5 = (double)averageScore; //Implicit Casting ==> Java make it automatically, you dont have write double inside the paranthesis
            long num6 = (long) averageScore;


            System.out.println("num1 = " + num1); // Result 20
            System.out.println("num2 = " + num2);
            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
            System.out.println("num5 = " + num5);
            System.out.println("num6 = " + num6);


            //Explicit Casting: Casting larger primitive types to the smaller
            //Implicit Casting: Casting smaller to larger

        /*
        Warmup tasks:
            1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to
                    each of them:
                                byte num1;
                                short num2;
                                int num3;
                                long num4;
                                float num5
                                double num6;
         */


        }

    }


