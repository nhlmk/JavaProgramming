package week04;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfBedrooms = scan.nextInt();
        int startingPrice;
        String result = "";

        if(numberOfBedrooms == 1){
            startingPrice = 1725;
            result = "One Bedroom Selected.\nStarting price: " + startingPrice;
        }else if(numberOfBedrooms == 2){
            startingPrice = 2899;
            result = "Two Bedroom Selected.\nStarting price: " + startingPrice;
        }else if( numberOfBedrooms == 3){
            startingPrice = 3000;
            result = "Three Bedroom Selected.\nStarting price: " + startingPrice;
        } else{
            result = "INVALID";
        }

        System.err.println(result);



    }
}
