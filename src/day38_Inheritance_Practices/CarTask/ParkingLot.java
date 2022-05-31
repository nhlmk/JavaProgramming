package day38_Inheritance_Practices.CarTask;

public class ParkingLot {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", 2020, 2000, "Blue", 12345);
   BMW bmw = new BMW("BMW", "X5", 2020, 67350, "Black", 12300);
   Tesla tesla = new Tesla("Tesla", "Model S", 2022, 83994, "Red", 0);

toyota.start();
bmw.start();
tesla.start();

    }

}
