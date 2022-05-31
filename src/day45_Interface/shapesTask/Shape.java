package day45_Interface.shapesTask;

public abstract class Shape {



    public final String name;
    public Shape(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public abstract double area();


    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' + "area : "+
                area() + " perimeter : " + perimeter() +
                '}';
    }
}
