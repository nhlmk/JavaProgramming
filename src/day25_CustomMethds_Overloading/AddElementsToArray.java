package day25_CustomMethds_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {
        int [] arr = { 4, 5, 2, 6, 6};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("+=++=++++++++++++++++++++++++++++");
        double[] arrD = {5.9, 2.3, 9.8};
        arrD = addDouble(arrD, 2.5);
        System.out.println(Arrays.toString(arrD));
        System.out.println("+=++=++++++++++++++++++++++++++++");
String[] arrC = { "qwer", "45vvd"};
arrC = addString(arrC, "abc");
        System.out.println(Arrays.toString(arrC));
        System.out.println("+=++=++++++++++++++++++++++++++++");
char[] arrE = { 'a', 'b', 'c', 'd'};
arrE = addChar(arrE, '9');
        System.out.println("Arrays.toString(arrE) = " + Arrays.toString(arrE));
    }


    public static int[] addInteger(int[] array, int element) {
       int[] result = new int[array.length+1];
        int i = 0;
        for(int each : array){
            result[i++] = each;
        }
        result [i] = element;
        return result;
    }
    
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for(double each : array){
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    
    public static String[] addString(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for(String each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }
    
    public static char[] addChar(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for(char each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }
    
}
