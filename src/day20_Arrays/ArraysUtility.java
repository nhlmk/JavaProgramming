package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 8, 7};
        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
