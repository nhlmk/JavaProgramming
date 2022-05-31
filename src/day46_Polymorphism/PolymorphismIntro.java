package day46_Polymorphism;

import day30_CustomClass.EmployeeObjects;
import day34_GarbageCollection.Circle;
import day43_Abstraction.personTask.Developer;
import day43_Abstraction.personTask.Employee;
import day43_Abstraction.personTask.Teacher;
import day43_Abstraction.personTask.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Interface.shapesTask.Cube;
import day45_Interface.shapesTask.Cylinder;
import day45_Interface.shapesTask.Shape;
import day45_Interface.shapesTask.Square;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "WoodenSpoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = false;

        Object[] array = {str, n1, n2, r1, new Circle(2.5), new Square(3.4)};

        Teacher teacher = new Teacher("Kelly", -30, 'f', 123000, "Chemist", 23400);
        Tester tester = new Tester("Jim", 35, 'm', 12400, "SDET", -1);
        Developer developer = new Developer("Kevin", 40, 'm', 300, "CodeBuster", 47000);

        ArrayList<Employee> cydeoEmployees = new ArrayList();
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(tester);

        System.out.println("==================================");

        Employee employee = new Developer("Alex", 40, 'm', 123, "Dev", 123.234);
        employee.work();
        Employee employee1 = new Teacher("Kelly", 30, 'f', 120, "Teacher", 23000);
        employee1.eat();

        Animal animal = new Dog("Max", "Husky", 'm', 3, "Small", "Brown");
        animal.eat();
        Playable animal2 = new Dog("Max", "Husky", 'm', 3, "Small", "Brown");
        System.out.println(animal2.isFriendly);
        animal2.play();


        Shape shape = new day45_Interface.shapesTask.Circle(5);
        shape.area();

        boolean isSquare = shape instanceof Square;
        boolean isCircle = shape instanceof day45_Interface.shapesTask.Circle;
        boolean isCylinder = shape instanceof Cube;







    }

}
