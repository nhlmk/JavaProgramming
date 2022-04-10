package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public int price;
    public static String OS = "IOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;



}


class IphoneObjects{
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.color= "Red";
        iphone1.model="13";
        iphone1.price=500;
        iphone1.size="Large";
        System.out.println("iphone1 = " + iphone1.color + " " + iphone1.price + " " + Iphone.brand + Iphone.OS );



    }
}