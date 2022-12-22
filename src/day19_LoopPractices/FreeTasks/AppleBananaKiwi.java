package day19_LoopPractices.FreeTasks;

public class AppleBananaKiwi {

    public static void main(String[] args) {

        String str = "apple banana kiwi", result = "", result2 = "";

        int space = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                space++;
            }
        }

        for (int i = 0; i < space+1; i++) {

            result = "";

            for (int j = str.length()-1; j >= 0; j--) {

                if(str.charAt(j) != ' '){
                    result += ""+str.charAt(j);
                }else{
                    break;
                }
            }

            for (int j = result.length()-1; j >= 0 ; j--) {
                result2 += ""+result.charAt(j);
            }

            if(i < space){

                result2 += " ";
                str = str.substring(0, str.length() - result.length() - 1);
            }

        }

        System.out.println(result2);


    }
}
