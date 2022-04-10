package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[] group1 = { "Jon", "Joes", "James"};
        String[] group2 = { "Jon", "Shay", "James"};
        String[] group3 = { "Jon", "Joes", "Cook"};

        String [] [] groups = new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("=================================");

        int[][] arr2d= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

      /*  for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < arr2d[i].length; i1++) {
                System.out.print(arr2d[i][i1]+" ");
            }
            System.out.println();
        }*/

        /*for (int i =  arr2d.length-1; i >= 0; i--) {
            for (int i1 = arr2d[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2d[i][i1] + " ");
            }
            System.out.println();
        }*/

        for(int[] each: arr2d){
            for(int eachElement : each){
                System.out.println(eachElement);
            }
        }

        System.out.println("================================");



    }
}
