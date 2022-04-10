package day07_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        byte num1 = 99;

        int two = num1 % 2;
        int three = num1 % 3;
        int five = num1 % 5;

        boolean divide2 = two == 0;
        boolean divide3 = three == 0;
        boolean divide5 = five == 0;

        System.out.println("99 is divisible by 5 = " + divide5);
        System.out.println("99 is divisible by 3 = " + divide3);
        System.out.println("99 is divisible by 2 = " + divide2);

        int a = '9';
        char b = '9';
        System.out.println("b = " + b);
        System.out.println("a = " + a);


    }
}
