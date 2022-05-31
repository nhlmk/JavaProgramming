package day45_Interface;

public interface PropertiesOfInterface {
    int a = 100;
    static int b = 200;

     static void method2(){
        System.out.println("static method.");
    }

    void method3();

     default void method4(){
        System.out.println("default method.");
    }



}

class Test implements PropertiesOfInterface{
    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        new Test().method4();
    }
}