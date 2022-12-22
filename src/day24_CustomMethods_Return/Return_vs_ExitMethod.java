package day24_CustomMethods_Return;

import java.awt.desktop.SystemEventListener;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");

    }

    public static void nameOfMonth (int numberOfMonth){

        if (numberOfMonth > 12|| numberOfMonth < 1){
            System.out.println("Invalid");
            System.exit(0); // I won't see "Hello World" on the console...
                                  // Everything will be terminated...
        }

        String nameOfMonth = (numberOfMonth==1)?"January" :(numberOfMonth==2)?"February" :(numberOfMonth==3)?"March"
                :(numberOfMonth==4)?"April" :(numberOfMonth==5)?"May" :(numberOfMonth==6)?"June"
                :(numberOfMonth ==7)?"July" :(numberOfMonth==8)?"August" :(numberOfMonth==9)?"September"
                :(numberOfMonth==10)?"October" :(numberOfMonth==11)?"November" : "December";

        System.out.println("Name of month : " + nameOfMonth);

    }





}
