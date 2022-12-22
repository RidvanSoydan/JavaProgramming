package day39_Encapsulation_Inheritance_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5);

    //  circle.name; Error message ==> Because name is private
        circle.setRadius(3.5);
        System.out.println(circle.area()); // 38.465
        System.out.println(circle); // Circle{radius=3.5, pi=3.14, area=38.465, perimeter=21.98}
        //circle.setRadius(0); // Invalid radius: 0.0
        //System.out.println(circle);


        Square square = new Square(4.5);

        System.out.println(square.getName()); //Square
        System.out.println(square.getSide()); //4.5
        square.setSide(5);
        System.out.println(square); // Square {side=5.0, area=25.0, perimeter=20.0}


        Rectangle rectangle =new Rectangle(14.5, 30);

        System.out.println(rectangle.perimeter()); // 89.0
        System.out.println(rectangle); // Rectangle{width=14.5, length=30.0, area=435.0, perimeter=89.0}



    }


}
