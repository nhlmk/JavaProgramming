package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));

        System.out.println("===========================");

        int[] scores=new int[5];
        scores[1]=new Scanner(System.in).nextInt();
        scores[scores.length-2] = new Scanner(System.in).nextInt();
        System.out.println(Arrays.toString(scores));

        System.out.println("==================================");

        String[] months = { "jan", "feb", "march", "apr"};

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]);

        }

        System.out.println("===============================");


    }
}
