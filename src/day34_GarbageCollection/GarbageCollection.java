package day34_GarbageCollection;

import day30_CustomClass.Dog;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {

    public static void main(String[] args) {
        String str = null;
        Car car1 = new Car("toyota");
        car1 = null;
        System.out.println(car1);

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
         dog1 = new Dog();
         dog1.name = "Max";
        System.out.println(dog1);

        String lang = "Python";
        lang = "Java";

        System.out.println("=========================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200, 300));
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);

        System.out.println(list1==list2);


    }


}
