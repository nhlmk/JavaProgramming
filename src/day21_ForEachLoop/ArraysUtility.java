package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(nums[0]);

        System.out.println("==================================================");

        int[] scores = { 48, 830, -21, 0, 432};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("minscore is " + scores[0]);
        System.out.println("maxscore is " + scores[scores.length-1]);

        System.out.println("===================================");

        String[] names = {"Ali", "veli", "kirdokuz", "elli"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("Max num= " + names[0]);
        System.out.println("min num " + names[names.length-1]);

        System.out.println("====================================");

        String[] anna = {"ANNA", "anna"};
        Arrays.sort(anna);

        System.out.println(Arrays.toString(anna));

        System.out.println("=======================================");

        int[] arr1 = {2, 1, 3};
        int[] arr2 = {1, 2, 3};

        Arrays.sort(arr2);
        Arrays.sort(arr1);

        boolean r1 = Arrays.equals(arr2,arr1);

        System.out.println(r1);

        System.out.println("=============================");

        char[] ch = {'e', 'a', 'r', 't', 'h'};
        char[] ch2 = {'h', 'e', 'a', 'r', 't', 'h'};

        Arrays.sort(ch);
        Arrays.sort(ch2);

        boolean eq = Arrays.equals(ch,ch2);
        System.out.println("anagram? " + eq);

    }
}
