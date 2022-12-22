package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        /*1. Write a program that can gte the domain of the email. 
        ( Assume that a valid email is given)
        Ex:
        email = Cydeo.School@gmail.com
        output:
        gmail

        email = "School.Cydeo@yahoo.com
        output:
        yahoo*/
        
        String email = "Cydeo.School@gmail.com";

        //domain: domain address between @ and .

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")); //universal solution...
        System.out.println("domain = " + domain);
        
        System.out.println("-------------------------------");
        
        String str1 = "Java is fun, Java is cool, I love Java";
        
        String s1 = str1.substring(0, 10+1); //Java is fun
        System.out.println("s1 = " + s1);

       // String s2 = str1.substring(str1.lastIndexOf("J")); //Java is cool
        //System.out.println("s2 = " + s2);

        //if we add I love Java

        String s3 = str1.substring(str1.indexOf(" J") + 1, str1.indexOf(", I"));
        System.out.println("s3 = " + s3);

        String s4 = str1.substring(str1.indexOf("I")); //I love Java
        System.out.println("s4 = " + s4);

    }
}
