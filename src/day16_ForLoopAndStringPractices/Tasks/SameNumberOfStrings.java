package day16_ForLoopAndStringPractices.Tasks;

public class SameNumberOfStrings {

    public static void main(String[] args) {

        String str = "caT dog dogG cAt";

        int numberOfCat = 0;
        int numberOfDog = 0;



        for (int i = 0; i < str.length()-3; i++) {

            String eachSub = str.substring(i,i+3);

            if (eachSub.equalsIgnoreCase("cat")){

                numberOfCat ++;
            }

            if (eachSub.equalsIgnoreCase("dog")){

                numberOfDog ++;
            }
        }
        boolean isTheSameNumber = numberOfDog == numberOfCat;
                System.out.println(isTheSameNumber);

    }
        /*write a program to print true if the string "cat" and "dog" appear
            the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true   */
    }

