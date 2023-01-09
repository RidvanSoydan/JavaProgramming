package day45_Abstraction_Interface.shape;

public class Sphere extends Shape implements Volume{

    private double radius;

    public final static double pi;

    static {
        pi = 3.14;
    }

    public Sphere(double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return (pi * radius * radius * radius) * (4/3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                super.toString() +
                ", radius=" + radius +
                ", volume=" + volume() +
                '}';
    }
}
