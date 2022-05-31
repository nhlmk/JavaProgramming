package day47_Polymorphism;

import day38_Inheritance_Practices.CarTask.BMW;
import day38_Inheritance_Practices.CarTask.Car;
import day38_Inheritance_Practices.CarTask.Tesla;
import day38_Inheritance_Practices.CarTask.Toyota;

public class PolymorphismPractice<cars> {
    public static void main(String[] args) {


        Car[] cars = {
                new Toyota("Camry", 2020, 2000, "Blue", 12345),
                new BMW("BMW", "X5", 2020, 67350, "Black", 12300),
                new Tesla("Tesla", "Model S", 2022, 83994, "Red", 0)
        };

        for (Car eachCar:cars) {
            if(eachCar instanceof Toyota){
                if(eachCar.year>=2000){
                    System.out.println(eachCar);
                }
            }

            if(eachCar instanceof BMW){
                System.out.println(eachCar);
            }




        }

        System.out.println("=============================");

        Car carWithHighestMilage = cars[0];

        for (Car eachCar: cars) {
            if(eachCar.miles>carWithHighestMilage.miles){
                carWithHighestMilage = eachCar;
            }
        }
        System.out.println(carWithHighestMilage);

        System.out.println("============================");

        Car carWithLowestMilage = cars[0];

        for(Car eachCar : cars){
            if(eachCar.miles<carWithLowestMilage.miles){
                carWithLowestMilage=eachCar;
            }
        }
        System.out.println(carWithLowestMilage);

    }
}
