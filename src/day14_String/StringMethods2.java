package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        /// replace () and replaceFirst () methods;

        //replace(oldValue, newValue): returns new string by repalcing All the old values with the given new value.
        //replaceFirst(oldValue, newValue): returns new string by replacing  the FIRST matching old values with the given new value.

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);

        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python ";
        System.out.println("sentence = " + sentence);
        sentence = sentence.replace("Python", "");
        System.out.println("sentence = " + sentence);
        sentence = sentence.replace("  ", " ");
        System.out.println("sentence = " + sentence);

        System.out.println("---------------------");

        String s = "Dog Dog Dog Dog Dog Dog ";
        System.out.println("s = " + s);
        s = s.replace("Dog", "Cat"); //if I want "Cat .." objects to assign s variable I need to assign back s = s.replace...
        System.out.println("s = " + s);              //Those methods end up creating new object, cant change the first String...

        System.out.println("----------------");
        String s2 = "C# is fun, C# is cool"; // I want to change 2nd C#
        s2 = s2.replace(" C#", " Java"); //I will write unique situation
        System.out.println("s2 = " + s2);
        System.out.println("--------------");

        String s3 = "Java";
        System.out.println("s3 = " + s3);
        s3 = s3.replace("a", "e"); //Jeve
        System.out.println("s3 = " + s3);

        System.out.println("---***********----");

        //replaceFirst () ==> it will replace just only the first matching one....

        String result = "Java Java Java";
        result = result.replace("Java", "Python");
        System.out.println("result = " + result);

        result = result.replaceFirst("Python", "Java");
        System.out.println("result = " + result); //Java, Python, Python

        System.out.println("----------------");

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java"); //I will write unique situation
        System.out.println("result2 = " + result2);


        String result3 = "Java";
        result3 = result3.replaceFirst("va", "o");
        System.out.println("result3 = " + result3);










    }
}
