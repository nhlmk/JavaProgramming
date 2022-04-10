package week08;

import java.util.Arrays;

public class EqualsMeth {
    public static void main(String[] args) {
        int[] nums = { 4, 6, 1, -21, 6};
        int[] nums2 = { 5, 4, -21, 8, 3};
        System.out.println("Arrays.equal(nums, nums2) = "+
                Arrays.equals(nums, nums2));
    }
}
