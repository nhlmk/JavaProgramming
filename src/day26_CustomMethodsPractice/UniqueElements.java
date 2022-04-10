package day26_CustomMethodsPractice;

import day25_CustomMethds_Overloading.AddElementsToArray;
import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] uniqueOnes = uniqueElement(new int[]{1,2,4,2,4,5,0});
        System.out.println("Arrays.toString(uniqueOnes) = " + Arrays.toString(uniqueOnes));
        
        char[] uniqueC =  uniqueElement(new char[]{'a', '8', '2', '-'});
        System.out.println("Arrays.toString(uniqueC) = " + Arrays.toString(uniqueC));
        
        double[] uniqueD = uniqueElement(new double[]{ 1.2,1.2,1.0,1.0,3.9});
        System.out.println("Arrays.toString(uniqueD) = " + Arrays.toString(uniqueD));
        
        String[] uniqueS = uniqueElement(new String[]{ "abc", "xyz", "abc"});
        System.out.println("Arrays.toString(uniqueS) = " + Arrays.toString(uniqueS));
        
    }
    
    public static int[] uniqueElement(int[] array) {
        int[] unique = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                unique = ArraysUtility.addElement(unique, each);
            }
        }
        
        return unique;
    }


    public static char[] uniqueElement(char[] array){
        char[] unique = {};

        for(char each:array){
            if(ArraysUtility.frequencyOfElement(array, each)==1){
unique = ArraysUtility.addElement(unique, each);

            }
        }
return unique;
    }


    public static String[] uniqueElement(String[] array){
        String[] unique = {};

        for(String each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                unique = ArraysUtility.addElement(unique, each);
            }
        }
        return unique;
    }


    public static double[] uniqueElement(double[] array){
        double[] unique = {};

        for(double each:array){
            if(ArraysUtility.frequencyOfElement(array, each)==1){
                unique = ArraysUtility.addElement(unique, each);

            }
        }
        return unique;
    }

    
}
