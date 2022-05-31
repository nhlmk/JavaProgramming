package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        Honda honda = new Honda("Accord", "Black", 2019, 30000);
        Audi audi = new Audi("Q7", "Blue", 2020, 45000);
        Tesla tesla = new Tesla("Model3", "White", 2021, 50000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("=========");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        tesla.setPrice(60000);
        audi.setPrice(50000);

honda.start();
tesla.autoPilot();
audi.stop();
        System.out.println(honda);
System.out.println(tesla);
        System.out.println(audi);
    }

}
