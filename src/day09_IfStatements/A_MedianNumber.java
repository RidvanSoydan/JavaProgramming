package day09_IfStatements;

public class A_MedianNumber {

    public static void main(String[] args) {

        /*Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

         */

        int a = 10, b =25, c =17;

        //if we have 3 DIFFERENT number, one must be minimum, one must be maximum, one must be median.

                    //a= 15, b= 10, c = 20    a = 15, c = 10, b = 20
        boolean aIsMedian = (a < b && a > c) || (a > c && a < b);
/*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

                 //      b=15, a = 20, c = 10,       b= 15,  a = 10, c= 20
        boolean bIsMedian = (b < a && b > c) || (b > a  && b < c);
                //one situation b is median  // other situation b is median
                // if one of this situation is true b is median so ve use || (OR LOGIC)
        /*
            in order for b to be the median number:
                    1. if a is the maximum number & c is the minimum number, then b is the median number
                    2. if c is the maximum number & a is the minimum number, then b is the median number
             */

        boolean cIsMedian = !aIsMedian && !bIsMedian;
        //boolean cIsMedian = (c < a && c > b) || (c > a && c < b);

        if (aIsMedian) { // if a is the median number

            System.out.println(a + " is the median number");
        }

        if (bIsMedian){ //if b is median number

            System.out.println(b + " is the median number");
        }

        if (cIsMedian){ // if c is median number
            System.out.println("\t" + c + "\n is the median number");
        }


    }
}
