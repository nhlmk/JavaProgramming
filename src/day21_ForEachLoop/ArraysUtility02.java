package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility02 {


    public static void main(String[] args) {

        String[] students = { "Elif", "Sinem", "Gunay", "David", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,5);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("==============================================");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        numbers = Arrays.copyOf(numbers, 3);

        System.out.println(Arrays.toString(numbers));

        System.out.println("===============================");
        char[] q = {'A', 'B', 'C', 'D', 'E', 'F'};
        q = Arrays.copyOfRange(q, 2, 5+2);

        System.out.println(Arrays.toString(q));

        System.out.println("===================================");

        int[] score = {20, 39, 82, 74, 29, 321, 21, 543};
        int[] res = Arrays.copyOfRange(score, 2, 7+1);

        System.out.println(Arrays.toString(res));


    }
}
