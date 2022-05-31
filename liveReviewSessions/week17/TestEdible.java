package week17;

public class TestEdible {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Chicken chicken = new Chicken();

        System.out.println(chicken.howToEat()+chicken.sound());
        System.out.println(apple.howToEat());
    }
}

interface Edible {
    String howToEat();

}

abstract class Animal{
    public abstract String sound();
}

class Chicken  extends Animal implements Edible{
    @Override
    public String howToEat() {
        return "Chicken: Fry it!";
    }

    @Override
    public String sound() {
        return "Cookadoodledoo";
    }
}

class Tiger extends Animal{
    @Override
    public String sound() {
        return "Roar!";
    }
}

abstract class Fruit implements Edible{

}
class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "make apple cider.";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "make juice of orange.";
    }
}