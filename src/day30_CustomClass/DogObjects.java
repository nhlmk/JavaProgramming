package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="Lucy";
        dog1.breed = "Husky";
        dog1.color = "White";
        dog1.age = 3;
        dog1.gender = 'F';
        dog1.size = "Small";

        System.out.println("dog1 = " + dog1);
        
        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Pomerian";
        dog2.age =  1;
        dog2.gender = 'M';
        dog2.size = "Big";
        dog2.color = "Brown";

        System.out.println("dog2 = " + dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Retriever", 1,'m', "Medium", "Black");
        System.out.println("dog3 = " + dog3);

        dog1.eat();
        dog3.bark();

Dog dog4 = new Dog();
dog4.setInfo("Bullet", "Labrador", 3, 'F', "Large", "White");
Dog dog5 = new Dog();
dog5.setInfo("Sully", "Pit-Bull", 5, 'M', "Small", "Black");

System.out.println("==========================");

        Dog[] dogs = { dog1, dog4, dog2, dog3, dog5};
        ArrayList<Dog> femaleDogs =  new ArrayList<>();
        ArrayList< Dog> maleDogs = new ArrayList<>();

        for(Dog each : dogs){
            if(each.gender=='F'||each.gender=='f'){
                femaleDogs.add(each);
            }
        }

        System.out.println("femaleDogs = " + femaleDogs);

        maleDogs.addAll(Arrays.asList(dogs));
   maleDogs.removeIf(p -> !(p.gender=='m'||p.gender=='M'));
        System.out.println(maleDogs);


    }
}
