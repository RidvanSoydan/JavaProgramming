package day21_ForEachLoop.FreeTask;

public class PrimeNumbers {

    public static void main(String[] args) {

        int [] list = {2,3,5,8,9,6,7,8,9,12,32,21,54,78,96,36,12,45,37,73,89};
        int count =0;

        for (int each:list) {
            for (int i = 1; i <=each; i++) {
                if(each%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(each+ " ");
            }
            count=0;
        }


    }
}
