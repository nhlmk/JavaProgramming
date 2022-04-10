package week04;

import java.util.Scanner;

public class Rushhour {

    public static void main(String[] args) {

        Scanner scan = new Scanner ( System.in);

        boolean isRushHour = scan.nextBoolean();
        int carType = scan.nextInt();
        double price = scan.nextDouble();

        if(carType == 1){
            if(isRushHour){
                price = 30.0;
            }else{
                price = 5.0;
            }
        }else if(carType == 2){
            if(isRushHour){
                price = 55.30;
            }else{
                price = 15.99;
            }
        }

        System.out.println(price);
    }
}
