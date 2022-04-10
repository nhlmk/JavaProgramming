package week10;

import java.util.Arrays;

public class CountOfEven {

    public static void main(String[] args) {
        int[] even = {1, 2, 3, 4, 5,6};
        System.out.println(even(even));
    }
    public static int even(int[] nums){
        
        int count = 0;
        
        for(int each : nums){
            if(each%2==0){
                count++;
            }
        }
        return count;
    }
}
