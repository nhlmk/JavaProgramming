package day07_Operators;

public class IdentifyNumber {

    public static void main(String[] args) {

        byte num1 = 100;
        boolean positive = num1 > 0;
        boolean negative = num1 < 0;
        boolean equal = num1 == 0;

        System.out.println("is " + num1 + " equal to zero = " + equal);
        System.out.println("is " + num1 + " negative number = " + negative);
        System.out.println("is " + num1 + " positive number = " + positive);

    }
}
