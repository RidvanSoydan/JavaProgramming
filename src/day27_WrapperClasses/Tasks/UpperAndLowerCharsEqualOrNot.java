package day27_WrapperClasses.Tasks;


public class UpperAndLowerCharsEqualOrNot {


    public static void main(String[] args) {

        String str = "JAVA java";

        int countUpper=0;
        int countLower=0;

        for (char each : str.toCharArray()){

            if (Character.isUpperCase(each)){
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            }
        }

        if (countUpper == countLower){
            System.out.println("true");
        }

        else{
            System.out.println("false");
        }


    }



    }



/*

Write program that returns true if the total number of upper case characters are equal
    to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */