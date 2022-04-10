package day35_OOP_Encapsulation;

import java.util.concurrent.Callable;

public class Circle {
    private double radius;
    public  static  double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0)
            return;
        this.radius = radius;
    }

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "calcPerimeter=" + calcPerimeter()+
                "calcArea=" + calcArea() +
                '}';
    }
}

class CircleObj{
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("circle1 = " + circle1);
    }
}