package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

    String [] words = {"Java", "Java", "C#", "C++", "Python", "Python"};


        for (int j = 0; j < words.length; j++) { // outer loop takes the elements from array

            String element = words [j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { // inner loop finds the frequency of elements from array

                if (words[i].equals(element)){
                    frequency++;
                }
            }
            if (frequency == 1){
                    System.out.println("Unique element = " + element);
            }

        }


    }
}
