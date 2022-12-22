package day15_ForLoop.PracticeTask;


public class UniqueChars {

    public static void main(String[] args) {


        String str ="AABBCCDEFF";
      //             0123456789

        String result ="";


        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (starting from 0)

            char ch = str.charAt(i);//ch: each characters of str

            if (str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same,
                                                         // then the character is unique
               result +=ch;
            }
        }

        System.out.println(result);


        /*Write a program that can return the unique characters from a String

                      Ex:
                          input:
                              AABCCD

                          output:
                              BD

         */
    }
}
