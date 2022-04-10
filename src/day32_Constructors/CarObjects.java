package day32_Constructors;

import java.util.concurrent.Callable;

public class CarObjects {
    public static void main(String[] args) {

     Car car1 = new Car("Toyota");
     Car car2 = new Car("Honda", "civic");
     Car car3 = new Car("BMW", "X6", 2021);
     Car car4 = new Car("Tesla", "Model 3", 2019, 50000);
     Car car5 = new Car("Lexus", "RX", 2018, 40000, "Blue");

        System.out.println("car5 = " + car1);



    }
}
