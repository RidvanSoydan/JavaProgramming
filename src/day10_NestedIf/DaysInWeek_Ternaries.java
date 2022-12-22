package day10_NestedIf;

public class DaysInWeek_Ternaries {


    public static void main(String[] args) {

        int n = 6; // 1 ~ 7
        String day;

        if (n == 1) {
            //System.out.println("Monday");
            day = "Monday";
        } else if (n == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";
        } else if (n == 3) {
            //System.out.println("Wednesday");
            day = "Wednesday";
        } else if (n == 4) {
            //System.out.println("Thursday");
            day = "Thursday";
        } else if (n == 5) {
            //System.out.println("Friday");
            day = "Friday";
        } else if (n == 6) {
            //System.out.println("Saturday");
            day = "Saturday";
        } else if (n == 7){
            //System.out.println("Sunday");
            day = "Sunday";
        } else {
            day = "---";
        }
        System.out.println("Day = " + day);

        System.out.println("--------------------------------------------");

        // Am I returning one value in every single blocks? yes every single if block has one value
        // Are those values same data types? Yes all of them String

        System.out.println((n == 1)? "Monday" : (n == 2)? "Tuesday" : (n == 3)? "Wednesday" : (n == 4) ? "Thursday"
                : (n == 5)? "Friday" : (n == 6)? "Saturday" : "Sunday");

        String result = (n == 1)? "Monday" : (n == 2)? "Tuesday" : (n == 3)? "Wednesday" : (n == 4) ? "Thursday"
                : (n == 5)? "Friday" : (n == 6)? "Saturday" : "Sunday";

        System.out.println("result = " + result);
    }
}
