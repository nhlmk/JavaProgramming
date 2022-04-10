package day25_CustomMethds_Overloading;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum = sumOfTwoNumbers(10, 20);
        int sum2 = sumOfThreeNumbers(10, 30, 9);
        System.out.println(sum+sum2);
    }


    public static int sumOfTwoNumbers(int a, int b) {
        return a+b;
    }

    public static int sumOfThreeNumbers(int a, int b, int c) {
        return a+b+c;
    }

    public static int sumOfFourNumbers(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
