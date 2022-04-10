package week08;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
String confirmation = "Id: 52432\n" + "Amount: 790 USD\n" + "Card Number: 243289809\n"+"Name: Oscar\n"+"Date: 11/10/2022";
String arr = confirmation.split("\n")[1].split(" ")[1];
        System.out.print(arr);
    }
}
