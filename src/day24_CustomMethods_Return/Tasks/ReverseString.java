package day24_CustomMethods_Return.Tasks;

public class ReverseString {

    public static void main(String[] args) {

        String sentence = "!KROW !KROW !KROW";

        String reversed = reversedString(sentence);
        System.out.println(reversed);
    }


    public static String reversedString (String str){

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }


}
/*
       create a method named reverse that passes one string parameter,
	   the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */