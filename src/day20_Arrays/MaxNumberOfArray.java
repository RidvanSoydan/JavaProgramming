package day20_Arrays;

public class MaxNumberOfArray {
    
    public static void main(String[] args) {
    
        int [] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; // 10

        // shortcut                         numbers.fori ==> Array variable name + .fori + Enter
        //Shortcut for reversed order       numbers.forr + Enter                    
        
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){ // // if there is element in the array that's greater than the current max number
                max = numbers[i]; // // assigning greater number to variable max
            }
        }
        System.out.println("max = " + max);



    }
}
