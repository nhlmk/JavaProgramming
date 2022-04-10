package week07;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("etner item " + count + "and its price : ");
            item = scan.nextLine();
            price = scan.nextDouble();
            shoppingListReport += "item " + count + ": "+ item + " price: " + price;
            count ++;
            totalPrice += price;
            System.out.println("add one more item? ");
            scan.nextLine();
            countinue = scan.nextLine();
        }
        while(countinue.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport);
        System.out.println("price = " + totalPrice);

    }
}
