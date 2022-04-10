package week06;

import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum ;
        String res = " " + num1 + " " + num2 + " ";

        for (int i = 0; i <= 6 ; i++) {
sum = num1 + num2;
num1 = num2;
num2 = sum;
            res +=sum + " ";

        }
        System.out.println(res);
    }
}
