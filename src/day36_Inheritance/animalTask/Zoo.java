package day36_Inheritance.animalTask;

import java.util.concurrent.Callable;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "Black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Ginger", "British", 'F', 5, "Small", "Brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("SherKhan", "Bengal", 'M', 3, "Large", "White");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();

    }
}
