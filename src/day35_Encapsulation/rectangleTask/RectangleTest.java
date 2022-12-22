package day35_Encapsulation.rectangleTask;

public class RectangleTest {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println(rectangle); // Rectangle{width=4.0, length=5.0, area=20.0, perimeter=18.0}

        rectangle.setLength(10);
        rectangle.setWidth(20);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle); // Rectangle{width=20.0, length=10.0, area=200.0, perimeter=60.0}


    }
}
