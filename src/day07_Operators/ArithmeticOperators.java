package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = -3;

        int division = num1 / num2;
        float realDivision = (float) num1 / num2;
        int remainder = num1 % num2;
        int addition = num1 + num2;
        int cikarma = num1 - num2;
        int multiple = num1 * num2;

        boolean kucuktur = num1 < 0;
        boolean buyuktur = num1 > num2;



        System.out.println(" division = " + division + " remainder = " + remainder +
                " addition = " + addition + " cikarma = " + cikarma +
                " multiple = " + multiple + " realDivision = " + realDivision +
                " kucuktur = " + kucuktur + " buyuktur = " + buyuktur + (num1 < 9393) + (num2 > 0));

    }

}
