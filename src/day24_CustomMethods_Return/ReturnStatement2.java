package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfMonth(13);
    }


    public static void nameOfMonth (int numberOfMonth){

        if (numberOfMonth > 12|| numberOfMonth < 1){
            System.out.println("Invalid");
            return; // exists nameOfMonth method, remaining code fragments of the method never gets executed...
        }

        String nameOfMonth = (numberOfMonth==1)?"January" :(numberOfMonth==2)?"February" :(numberOfMonth==3)?"March"
                    :(numberOfMonth==4)?"April" :(numberOfMonth==5)?"May" :(numberOfMonth==6)?"June"
                    :(numberOfMonth ==7)?"July" :(numberOfMonth==8)?"August" :(numberOfMonth==9)?"September"
                    :(numberOfMonth==10)?"October" :(numberOfMonth==11)?"November" : "December";

        System.out.println("Name of month : " + nameOfMonth);

    }






}
