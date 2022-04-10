package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachArray {

    public static void main(String[] args) {

        int[] number = {0, 2, 4, 2, 1};

        for(int each : number) {
            System.out.print(each);

            System.out.println("+++===========================================");

            int[] numbers = {10, 20, 30, 50, 60, 70};

            for(int i = 1; i < numbers.length-1; i++) {
                int eachElement = numbers[i];
                System.out.println(eachElement);
            }

            System.out.println("=================================");

            for(int eachEls : numbers) {
                System.out.println(eachEls);
            }

            System.out.println("===================");

            int[] digits = {9, 4, 6, 7, 0,8};
            int min = digits[0];

            for(int sayi : digits ){
                if(sayi < min){
                    min = sayi;
                }
            }
            System.out.println(min);


            System.out.println("=============================");

            int[] numz = {2, 5, 6, 1, 4,6,};

            int sum = 0;

            for(int i : numz){
                sum+=i;
            }

            System.out.println(sum/ numz.length);

        }

        System.out.println("=======================================");

        String[] wordz = {"Ja va", "Python", "Hello", "Wor ld"};

        for(String each : wordz){
            System.out.println(each.charAt(1) + "" + each.charAt(each.length()-1));
        }

    }
}
