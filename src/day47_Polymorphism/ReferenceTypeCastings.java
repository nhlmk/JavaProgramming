package day47_Polymorphism;

import day30_CustomClass.Employee;
import day31_Constructors.scrumTask.Tester;
import day43_Abstraction.personTask.Person;
import day43_Abstraction.personTask.Teacher;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Interface.shapesTask.Circle;
import day45_Interface.shapesTask.Cube;
import day45_Interface.shapesTask.Shape;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Animal animal = new Dog("Max", "Husky", 'm', 3, "Small","Brown");
        Dog dog = new Dog("Lilac", "Husky", 'm', 3, "Small","Brown");
       // Dog dog = (Dog) animal --> down-casting.
        System.out.println(animal.getName());
        System.out.println(dog.getName());
        animal.eat();
        ((Dog) animal).bark();
        dog.bark();

        System.out.println("======");

        Animal animal1 = new Cat( "Lolly", "Siyamese", 'f', 4, "Small", "Blue");
        animal1.drink();
        ((Cat) animal1).scratch();
        ((Cat) animal1).scratch();

        System.out.println("=======");

        Person employee = new Teacher("Jim", 20, 'f', 1020,  "SDET", 2300);
        employee.sleep();
        System.out.println("===========");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
       // ((Cube)s1).volume();

    }
}
