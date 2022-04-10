package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {

        String[] items = {"Shoe", "AirPd", "Cloth", "Jacket"};
        double[] prices = {99.99, 150.0, 9.99, 250.0};
        int[] itemIDs= {12, 54, 25, 65};

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int itemId = itemIDs[i];

            System.out.println(item + "-" + price + "-" + itemId);

        }
    }
}
