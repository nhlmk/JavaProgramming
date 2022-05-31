package day38_Inheritance_Practices.CarTask;

public class BMW extends Car{


    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + model + " breaks down every 100 miles.");
    }

    public void racing(){
        System.out.println(brand + model + " is a racing car.");
    }

    @Override
    public void start() {
        System.out.println("call mchaninc to jump start " + brand + model);    }
}
