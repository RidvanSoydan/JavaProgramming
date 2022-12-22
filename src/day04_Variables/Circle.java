package day04_Variables;

public class Circle {


    public static void main(String[] args) {

/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius (yarıçap), diameter (çap), area (alan), perimeter (çevre)
					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */
        double PI = 3.14;
        double radius = 3.5;
        double diameter = 2 * radius; //2 * 10 // finds the diameter by multiplying the radius to 2
        double areaofCircle = PI * radius * radius; // 3.14 * 10 * 10 // finds the area of circle
        double perimeterofCircle = PI * diameter; // finds the perimeter of the circle

        System.out.println("radius = " + radius);
        System.out.println("PI = " + PI);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeterofCircle = " + perimeterofCircle);
        System.out.println("areaofCircle = " + areaofCircle);


    }
}
