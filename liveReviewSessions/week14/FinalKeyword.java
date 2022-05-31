package week14;

import java.util.ArrayList;

public class FinalKeyword {

    public static void main(String[] args) {

        final int a;
        a = 100;
        System.out.println(a);

        final  int[] nums = {1,2,3};
        System.out.println(nums[0]);
       // nums = new int[]{5,6,7};
        nums[0]=5;
        System.out.println(nums[0]);


        final ArrayList<String> colors = new ArrayList<>();

        colors.add("orange");
        colors.add("redd");
        colors.remove(0);
       // colors = new ArrayList<>(5);
    }
}
