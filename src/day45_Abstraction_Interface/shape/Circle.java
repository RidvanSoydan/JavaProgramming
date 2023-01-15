package day45_Abstraction_Interface.shape;


/*
interface XX{

}

interface YY{

}

abstract class BB{

}

abstract class AA{

}

*/

public class Circle extends Shape{

    public final static double pi;

    private double radius;

    static {
        pi = 3.14;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return pi * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radius=" + radius +
                '}';
    }
}
