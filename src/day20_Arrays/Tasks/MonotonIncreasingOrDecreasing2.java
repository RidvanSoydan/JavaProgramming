package day20_Arrays.Tasks;

public class MonotonIncreasingOrDecreasing2 {

    public static void main(String[] args) {

        int[] arr = {21, 154, 160, 959};  // This is monoton increasing

        boolean monotonIncreasing = true;
        boolean monotonDecreasing = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<arr[i]) {
                monotonIncreasing = false;
                break;
            }
        }


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>arr[i]) {
                monotonDecreasing = false;
                break;
            }
        }

        System.out.println("monotonIncreasing = " + monotonIncreasing);
        System.out.println("monotonDecreasing = " + monotonDecreasing);

        boolean monoton = monotonIncreasing || monotonDecreasing;
        System.out.println("monoton = " + monoton);

    }


}
