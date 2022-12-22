package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {


        //***trim () method; to remove white spaces, unnecessary spaces. Returns new String without the white spaces (unused spaces)
                    // white spaces between words wont be removed just unnecessary spaces...

        String str1 = "  batch 25       ";

        str1 = str1.trim(); // batch25 //original str cannot be modified so you rewrite the str1

        System.out.println("str1 = " + str1);




        //*** indexOf(str):  returns the index number of first occurred character. returns int
        //*** lastIndexOf(str):  returns the index number of last occurred character. returns int

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2); //compiler works from left the right so it will look the first "o", result is 4

        int n3 = str2.indexOf("ool");
        System.out.println("n3 = " + n3); // result 9

        String str3 = "Java Programming language";

        int n4 = str3.indexOf("an");
        System.out.println("n4 = " + n4); //if you want to find the index number of 2nd or the other "a"
                                         // you need to write more than one character to be able make it unique
                                        // exp : "an", "amm", "a "
                                        //if not compiler will find the index num of first "a"

        int n5 = str3.indexOf("g ");
        System.out.println("n5 = " + n5); //15


        //last index () ==> in this method compiler works from right to left

        int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = " + n6); //23

        System.out.println("------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirtA = s.indexOf("a C");
        int forthA = s.indexOf("ava W");
        int forthA2 = s.lastIndexOf("av");
        int forthA3 = s.indexOf("Ca") + 1; // this will give the index number of c
        int fifthA = s.lastIndexOf("va") + 1;
        int sixthA = s.lastIndexOf("aw");
        int sevethA = s.lastIndexOf("a ");
        int eighthA = s.lastIndexOf("a");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirtA = " + thirtA);
        System.out.println("forthA = " + forthA);
        System.out.println("forthA2 = " + forthA2);
        System.out.println("forthA3 = " + forthA3);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("sevethA = " + sevethA);
        System.out.println("eighthA = " + eighthA);



    }
}
