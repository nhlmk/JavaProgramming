package week04;

import java.util.Scanner;

public class AmazonFreeShipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double itemPrice = scan.nextInt();

        String result = "";

        if (itemPrice >= 25.0) {
            result = "Free shipment available! Your order total: " + itemPrice;

        } else {
            result = "There is no free shipment. In order to free shipment more than: " + (25 - itemPrice);
        }

        System.out.println(result);

    }
}
