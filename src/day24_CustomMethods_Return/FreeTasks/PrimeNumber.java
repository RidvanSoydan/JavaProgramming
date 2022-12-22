package day24_CustomMethods_Return.FreeTasks;

public class PrimeNumber {

    public static void main(String[] args) {

        boolean result = isPrimeOrNot(6); //true
        System.out.println(result);

    }

    public static boolean isPrimeOrNot(int number) {

        boolean isPrimeNumber = true;

        if (number < 2) {

            return false;
           // isPrimeNumber=false;
           // return isPrimeNumber;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

}


/*
        Task 2 :   Write a method that can check if a number is prime or not

	        Note :
			Prime numbers are special numbers, greater than 1,
			that have exactly two factors, themselves and 1

				7
			is divisible by	 2
			""	             3
			""	             4
			""	             5
	        ""	             6
         */
