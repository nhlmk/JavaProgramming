package day27_WrapperClasses;

import day42_Exceptions.utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        int[] arrayI = {2,3,3,2,1,1,2,4,4,6,7};
        arrayI = removeDuplicates(arrayI);
        System.out.println("Arrays.toString(arrayI) = " + Arrays.toString(arrayI));

        double[] arrayD = {0.1, 0.2, 0.3, 0.2, 0.1, 0.3, 0.3};
        arrayD = removeDuplicates(arrayD);
        System.out.println("Arrays.toString(arrayD) = " + Arrays.toString(arrayD));

        char[] arrayC = {'1', 'p', 'P', '1', 'o', '1'};
arrayC = removeDuplicates(arrayC);
        System.out.println("Arrays.toString(arrayC) = " + Arrays.toString(arrayC));

        String[] arrayS = { "123", "+_+_", "123", "okl", "123"};
       arrayS = removeDuplicates(arrayS);
        System.out.println("Arrays.toString(arrayS) = " + Arrays.toString(arrayS));







    }
   
   
   
   
    // remove duplicate integers in an integer array, returns new integer array.
    public static int[] removeDuplicates(int[] array){
        int[] result = {};

        for (int each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        
        return result;
    }

    // remove duplicate doubles in a double array, returns new double array.
    public static double[] removeDuplicates(double[] array){
        double[] result = {};

        for (double each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // remove duplicate chars in a char array, returns new char array.
    public static char[] removeDuplicates(char[] array){
        char[] result = {};

        for (char each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // remove duplicate Strings in a string array, returns new string array.
    public static String[] removeDuplicates(String[] array){
        String[] result = {};

        for (String each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
    
}
