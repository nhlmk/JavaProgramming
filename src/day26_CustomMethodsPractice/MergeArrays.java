package day26_CustomMethodsPractice;

import day42_Exceptions.utilities.ArraysUtility;

public class MergeArrays {

    public static void main(String[] args) {

       /* int[] ints = mergeArrays(new int[]{1,2,3}, new int[]{4,5,6});
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        String[] str = mergeArrays(new String[]{"asdf", "wer", "tyu"}, new String[]{ "kml", "uio"});
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));

        double[] dbl = mergeArrays(new double[]{1.2,3.1,1.2}, new double[]{4.5,9.9});
        System.out.println("Arrays.toString(dbl) = " + Arrays.toString(dbl));

        char[] ch = mergeArrays(new char[]{'l', 'p', '8'}, new char[]{'3', '?', '{'});
        System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));
        */
    }
    
    
    // merge two integer arrays and return the new array.
    public static int[] mergeArrays(int[] array1, int[] array2){
        int[] result = {};
        

        for(int each : array1){
            result = ArraysUtility.addElement(result, each);
        }
        for(int each : array2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    // merge two String arrays and return the new array.
    public static String[] mergeArrays(String[] array1, String[] array2){
        String[] result = {};


        for(String each : array1){
            result = ArraysUtility.addElement(result, each);
        }
        for(String each : array2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    // merge two char arrays and return the new array.
    public static char[] mergeArrays(char[] array1, char[] array2){
        char[] result = {};


        for(char each : array1){
            result = ArraysUtility.addElement(result, each);
        }
        for(char each : array2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    // merge two double arrays and return the new array.
    public static double[] mergeArrays(double[] array1, double[] array2){
        double[] result = {};


        for(double each : array1){
            result = ArraysUtility.addElement(result, each);

        }
        for(double each : array2){
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }





}
