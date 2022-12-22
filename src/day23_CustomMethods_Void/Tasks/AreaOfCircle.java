package day23_CustomMethods_Void.Tasks;

public class AreaOfCircle {

    public static void main(String[] args) {

        areaOfCircle(4.5);

    }

    public static void areaOfCircle (double radius){

        double area = radius * radius * 3.14;
        System.out.println("Area = " + area);
    }


}
        /*
            create a method that can calculate the area of a circle
         */