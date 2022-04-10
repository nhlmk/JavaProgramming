package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAllElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 2, 3, 4, 3, 4, 3};
        replaceAll(array, 3, 8);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        double[] arrayD = {0.1, 0.2, 0.3, 0.2, 0.1, 0.3, 0.3};
        replaceAll(arrayD, 0.3, 7.6);
        System.out.println("Arrays.toString(arrayD) = " + Arrays.toString(arrayD));

        char[] arrayC = {'1', 'p', 'P', '1', 'o', '1'};
        replaceAll(arrayC, '1', 'B');
        System.out.println("Arrays.toString(arrayC) = " + Arrays.toString(arrayC));

        String[] arrayS = { "123", "+_+_", "123", "okl", "123"};
        replaceAll(arrayS, "123", "BKU");
        System.out.println("Arrays.toString(arrayS) = " + Arrays.toString(arrayS));






    }


    // in an integer array, replaces all the given integer elements with new integer element, creates a new integer array.
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    // in a double array, replaces all the given double elements with new double element, creates a new double array.
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    // in a char array, replaces all the given char elements with new char element, creates a new char array.
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    // in a String array, replaces all the given String elements with new String element, creates a new String array.
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }



}