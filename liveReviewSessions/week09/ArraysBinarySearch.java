package week09;

import java.util.Arrays;

public class ArraysBinarySearch {

    public static void main(String[] args) {
        int[] nums = { -5, 23, 123, 4, 7};
        int indexOne = Arrays.binarySearch(nums, 23);
        int indexTwo = Arrays.binarySearch(nums, 200);
        System.out.println("indexOne = " + indexOne);
        System.out.println("indexTwo = " + indexTwo);
    }
}
