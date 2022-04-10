package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {
        int[] array = { 1,2,3,4};
        int[] result = reverseArray(array);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
    
// reverses an integer array, returns to a new array.
    public static int[] reverseArray(int[] array){
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    // reverses a double array, returns to a new array.
    public static double[] reverseArray(double[] array){
        double[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

// reverses a char array, returns to a new array.
    public static char[] reverseArray(char[] array){
        char[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    // reverses a String array, returns to a new array.
    public static String[] reverseArray(String[] array){
        String[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }




}
