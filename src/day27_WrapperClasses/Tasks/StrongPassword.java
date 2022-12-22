package day27_WrapperClasses.Tasks;


public class StrongPassword {

    public static void main(String[] args) {


        String password = "Aa15&89%";

        boolean passwordLength = password.length() >= 8 && !password.contains(" ");

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        char [] passwordChars = password.toCharArray();


      for (char each : passwordChars){

            if (Character.isDigit(each))
               hasDigit = true;
            else if(Character.isLowerCase(each))
               hasLower = true;
            else if (Character.isUpperCase(each))
               hasUpper = true;
            else
               hasSpecialChar = true;
        }

        boolean isStrongPassword = hasSpecialChar && hasLower && hasUpper && hasDigit && passwordLength;

        System.out.println("Password is strong : " + isStrongPassword);

        }

    }


/*
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:

        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
*/