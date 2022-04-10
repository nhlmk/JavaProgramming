package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {
        int[] ints = removeElement(new int[] { 9,1,2,2,3}, 1);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        String[] str = removeElement(new String[]{"zxc", "vbn", "mkl"}, 1);
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        
    }

    public static int[] removeElement(int[] array, int index){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
        }

       int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;


    }


    public static String[] removeElement(String[] array, int index){
        if(index<0||index>array.length-1){
            System.err.println("Invalid index: " + index);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;


    }
    
}
