package week08;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        int[] nums = {4, 6, 2, -2, 66};

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i]=nums[nums.length-1 - i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}