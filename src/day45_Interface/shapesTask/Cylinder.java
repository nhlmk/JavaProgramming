package day45_Interface.shapesTask;

public class Cylinder extends Shape implements Volume {
    int radius;
    double pi;
    int height;

    public Cylinder(String name, int radius, double pi, int height) {
        super(name);
        this.radius=radius;
        this.pi=pi;
        this.height=height;

    }

    @Override
    public double area() {
        return 2*pi*radius*radius+2*pi*radius*height;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }
}
