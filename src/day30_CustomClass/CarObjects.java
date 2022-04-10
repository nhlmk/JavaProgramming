package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo( "Toyota", "Camry", "White", 2021, 35000);
        System.out.println("car1 = " + car1);

        car1.stop();


        Car car2 = new Car();

        car2.setInfo("Honda", "Civic", "Gray", 2020, 20000);
        System.out.println("car2 = " + car2);
        car2.stop();

        Car car3 = new Car();

        car3.setInfo("Mini", "Straight", "Red", 2022, 40000);
        System.out.println("car3 = " + car3);

        ArrayList<Car> list = new ArrayList<>();
        list.addAll(Arrays.asList(car1, car2, car3));

        for(Car each : list){
            System.out.println(each.brand + " " + each.price);
        }

        System.out.println("======================================");

        list.removeIf(p -> p.brand.equals("Honda")&&p.year >= 2005 && p.year<=2021);
        list.removeIf(p -> p.brand.equals("Toyota")&& p.year >= 1995 && p.year<=1997);

        System.out.println("list = " + list);

    }
}
