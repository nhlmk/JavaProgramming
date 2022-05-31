package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAnElement {

    public static void main(String[] args) {
        int[] array = { 1,2,3,4,5,6};
        replace(array, 2, 30);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        
        double[] arrayD = {1.2,1.2,1.3,1.1};
        replace(arrayD, 0, 3.4);
        System.out.println("Arrays.toString(arrayD) = " + Arrays.toString(arrayD));
        
        char[] arrayC = { 'a', 'c', '2', '=', '+'};
        replace(arrayC, 4, '?');
        System.out.println("Arrays.toString(arrayC) = " + Arrays.toString(arrayC));

        String[] arrayS = { "qwe", "123", "32we", "io89", "+_32df", "0"};
        replace(arrayS, 3, "bvnmx0--=");
        System.out.println("Arrays.toString(arrayS) = " + Arrays.toString(arrayS));
        
    }
    
    
    // replaces an index of an integer array with given integer element, returns integer array.
    public static int[] replace(int[] array, int index, int newElement ) {
if(index<0||index>array.length-1){
    System.err.println("Invalid index number: " + index);
}

array[index]=newElement;
return array;
     
}

    // replaces an index of a double array with given double element, returns double array.
    public static double[] replace(double[] array, int index, double newElement ) {
        if(index<0||index>array.length-1){
            System.err.println("Invalid index number: " + index);
        }

        array[index]=newElement;
        return array;

    }

    // replaces an index of a char array with given char element, returns char array.
    public static char[] replace(char[] array, int index, char newElement ) {
        if(index<0||index>array.length-1){
            System.err.println("Invalid index number: " + index);
        }

        array[index]=newElement;
        return array;

    }

    // replaces an index of an String array with given String element, returns String array.
    public static String[] replace(String[] array, int index, String newElement ) {
        if(index<0||index>array.length-1){
            System.err.println("Invalid index number: " + index);
        }

        array[index]=newElement;
        return array;

    }





}