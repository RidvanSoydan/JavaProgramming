package day18_NestedLoop.Tasks;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int countFrequency = 0;// represents the frequency of the ch...

            for (int j = 0; j <str.length() ; j++) { //compares the characters that outer loop picked,
                                                     // with each characters of the string...

                char eachChar = str.charAt(j);

                if (ch==eachChar){
                    countFrequency++;
                }
            }
            if (countFrequency >= 1){ //if the frequency of the characters is 1, then the character is unique...
                result +=ch;
            }

        }
        System.out.println(result);



    }
}
