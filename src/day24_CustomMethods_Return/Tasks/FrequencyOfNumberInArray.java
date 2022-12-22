package day24_CustomMethods_Return.Tasks;

public class FrequencyOfNumberInArray {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,45,55,5,5,4,4};

        int result = freqOfElementInArray(arr1, 4);
        System.out.println("Frequency : " +  result);

    }

    public static int freqOfElementInArray (int [] arr, int element){

        int frequency = 0;

        for (int each : arr) {
            if(each == element)
                frequency++;
        }

        return frequency;
    }

}


/*
         create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */