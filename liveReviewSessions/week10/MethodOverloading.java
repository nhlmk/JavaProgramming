package week10;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(convertBritishMetric(5.0, 11.0));

        System.out.println(convertBritishMetric(71));
    }




    public static double convertBritishMetric(double feet, double inches){

        if(feet<0 || inches < 0 || inches > 12){
            System.err.println("Inv feet of inches");
            return -1.0;
        }

         return feet*12*2.54+inches*2.54;
    }
    public static double convertBritishMetric(double inches){
        if(inches<0){
            System.err.println("Invalid feet or inches.");
            return -1;
        }

        return inches*2.54;
    }
}
