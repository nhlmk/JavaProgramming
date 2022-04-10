package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensional02 {
    public static void main(String[] args) {

        int[][][] arr = { {{3,5,7},{5,3,6},{2,4},{3,4,1}},{{432,65},{2,5,7},{4,62,5}}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println((arr[0][3][1]));
        for ( int[][] each2d: arr){
            for(int[] each1d : each2d){
                for(int each:each1d){
                    System.err.println(each);
                }

                System.out.println("========================");
                int [][][][] arr4D =
                        {{ {{3,5,7},{5,3,6},{2,4},{3,4,1}},{{432,65},{2,5,7},{4,62,5}}}};

            }
        }
    }
}
