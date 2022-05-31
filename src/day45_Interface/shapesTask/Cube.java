package day45_Interface.shapesTask;

public class Cube extends Shape implements Volume {

    int side;

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return side*side*6;
    }

    @Override
    public double perimeter() {
        return side*12;
    }


    @Override
    public double volume() {
        return side*side*side;
    }
}
