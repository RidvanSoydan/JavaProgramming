package day20_Arrays.Tasks;

public class MonotonIncreasingOrDecreasing {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        int [] list = {5,4,3,3,2,1};
        int [] list2 = {1,3,2,4,5,8,6};
        int [] arr1 = {2,4,4,5,7,9,11,11,15};
        int []arr2 = {1,1,2,2,3,4,5,7};
        int []list1 = {1,1,2,2,3,4,5,7,6};
        int [] arr4 = {7,5,5,2,4,2,1};

        System.out.println(isMonotone(arr));
        System.out.println(isMonotone(list));
        System.out.println(isMonotone(list2));
        System.out.println(isMonotone(arr1));
        System.out.println(isMonotone(arr2));
        System.out.println(isMonotone(list1));
        System.out.println(isMonotone(arr4));
    }

    public static boolean isMonotone(int [] arr) {

        boolean isMonotone = false;

        int count = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                count++;
            }
        }

        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] >= arr[j - 1]) {
                count1++;
            }
        }

        if ((count == arr.length - 1) || (count1 == arr.length - 1)) {
            isMonotone=true;
        } else {
            isMonotone=false;
        }

        return isMonotone;
    }


}




