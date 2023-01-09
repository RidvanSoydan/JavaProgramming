package day45_Abstraction_Interface.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;


    public Cylinder(String name) {
        super(name);
    }


    @Override
    public double area() {
        return 0;
    }


    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}
