package day34_GarbageCollection;

import java.util.ArrayList;

public class Circle {
    
    public double radius;
    public static  double pi;
    public static String name;
    public static ArrayList<Integer> numbers;
    
   
    public Circle(double radius){
        this.radius = radius;
        pi = 3.14;
    }
    
    static {
        pi = 3.14;
        name = "Circle";
    
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    public static void main(String[] args) {
        Circle circle1  = new Circle(1);
        System.out.println("circle1.radius+circle1.pi = " + circle1.radius+circle1.pi);
        
        
    }
    
}
