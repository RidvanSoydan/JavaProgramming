package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {

        //pre condition: if there is only one statement in the block

        int number = 10;
        String result = "";
                                            /*if there only one statement within the if blocks
                                            you dont need to use curly braces */
            if (number ==1)                //NOT ADVISED, if you are sure there wont be more than one statement you can use
                result = "January";         //USING CURLY BRACES IS EASY TO READ

             else if (number==2)
                result = "February";

            else if (number == 3)
                result = "March";

            else if (number==4)
                result = "April";

            else if (number==5)
                result = "May";

            else if (number==6)
                result = "June";

            else if (number==7)
                result = "July";

            else if (number==8)
                result = "August";

            else if (number==9)
                result = "September";

            else if (number==10)
                result = "October";

            else if (number==11)
                result = "November";

             else
                result = "December";


            System.out.println(result);





    }
}





