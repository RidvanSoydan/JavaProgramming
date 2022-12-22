package day19_LoopPractices.FreeTasks;

public class ReverseEachWordInOwnPlace {

    public static void main(String[] args) {

        /*--  Task 4: Reverse each word in a sentence.
                input:
                String str = "Adam come here";

                output:
                madA emoc ereh
         */
        String str = "Adam come here";
        String result="";

        for (int i = 0; i <str.length() ; i++) {


            if(str.charAt(i)==' '){

                for (int j = i-1; j >=0 ; j--) {

                    result+= str.charAt(j);
                }
                result+=" ";
                str=str.substring(i+1);
                i=0;

            }
            if(i==str.length()-1){
                for (int j = i; j >= 0; j--) {
                    result+=str.charAt(j);
                }
                System.out.println(result);
                System.exit(0);
            }
        }

        String str1 = "Adam come here";
        String result1 = "";

        while(str1.contains(" ")) {

            int firstIndexOfFirstSpace = str1.indexOf(" ");

            for (int i = firstIndexOfFirstSpace - 1; i >= 0; i--) {

                result1 += str1.charAt(i);
            }

            result1 += " ";

            str1 = str1.substring(firstIndexOfFirstSpace + 1);
        }

        if (str1.length()>0){

            for (int i = str1.length() - 1; i >= 0; i--) {
                result1 += str1.charAt(i);
            }
        }
        System.out.println(result1);


    }
}
