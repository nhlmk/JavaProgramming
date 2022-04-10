package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines.
    public static void printEach (int[] array){
        for (int each:array) {
            System.out.println(each);
        }
    }
    
    // prints each double of double array in separate lines.
    public static void printEach(double[] array){
        for (double each : array){
            System.out.println(each);
        }
    }

    // prints each char of char array in separate lines.
    public static void printEach(char[] array){
        for (char each : array){
            System.out.println(each);
        }
    }

    // prints each String of String array in separate lines.
    public static void printEach(String[] array){
        for (String each : array){
            System.out.println(each);
        }
    }

    // returns the maximum number from integer array.
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for double array.
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the minimum number from an integer array.
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
   
    // returns the minimum number from a double array.
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    
    // checks if the given integer is contained in the given array, returns boolean, contains (int[], int)
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for(int each : array){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array, returns boolean, contains (double[], double)
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for(double each : array){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given array, returns boolean, contains (char[], char)
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for(char each : array){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given array, returns boolean, contains (String[], String)
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for(String each : array){
            if(each.equalsIgnoreCase(element)){
                result = true;
            }
        }
        return result;
    }

    // adds an integer element to a integer array.
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length+1];
        int i = 0;
        for(int each : array){
            result[i++] = each;
        }
        result [i] = element;
        return result;
    }

    // adds a double element to a double array.
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for(double each : array){
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // adds a char element to a char array.
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for(char each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }

    // adds a string element to a string array.
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for(String each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }

    // frequency of an integer element in an integer array.
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;

        for (int each : array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // frequency of a double element in a double array.
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;

        for (double each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    // frequency of a char element in a char array.
    public static char frequencyOfElement(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return (char) count;
    }

    // frequency of a String element in a String array.
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;

        for (String each : array){
            if(each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }

    // unique elements in an integer array.
    public static int[] uniqueElement(int[] array) {
        int[] unique = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                unique = ArraysUtility.addElement(unique, each);
            }
        }

        return unique;
    }

    // unique elements in a double array.
    public static double[] uniqueElement(double[] array){
        double[] unique = {};

        for(double each:array){
            if(ArraysUtility.frequencyOfElement(array, each)==1){
                unique = ArraysUtility.addElement(unique, each);

            }
        }
        return unique;
    }

    // unique elements in a char array.
    public static char[] uniqueElement(char[] array){
        char[] unique = {};

        for(char each:array){
            if(ArraysUtility.frequencyOfElement(array, each)==1){
                unique = ArraysUtility.addElement(unique, each);

            }
        }
        return unique;
    }

    // unique elements in a string array.
    public static String[] uniqueElement(String[] array){
        String[] unique = {};

        for(String each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                unique = ArraysUtility.addElement(unique, each);
            }
        }
        return unique;
    }

    // removes the index from the array, returns new integer array.
    public static int[] removeElement(int[] array, int index){
        if(index<0|| index>array.length-1){
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];
        int j = 0;
        for (int i = 0; i< array.length; i++){
            if(i==index){
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }

    // removes the index from the array, returns new double array.
    public static double[] removeElement(double[] array, int index){
        if(index<0|| index>array.length-1){
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];
        int j = 0;
        for (int i = 0; i< array.length; i++){
            if(i==index){
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }

    // removes the index from the array, returns new String array.
    public static String[] removeElement(String[] array, int index){
        if(index<0|| index>array.length-1){
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];
        int j = 0;
        for (int i = 0; i< array.length; i++){
            if(i==index){
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }

    // removes the index from the array, returns new char array.
    public static char[] removeElement(char[] array, int index){
        if(index<0|| index>array.length-1){
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];
        int j = 0;
        for (int i = 0; i< array.length; i++){
            if(i==index){
                continue;
            }
            result[j++]= array[i];
        }
        return result;
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

    // replaces an index of a String array with given String element, returns String array.
    public static String[] replace(String[] array, int index, String newElement ) {
        if(index<0||index>array.length-1){
            System.err.println("Invalid index number: " + index);
        }

        array[index]=newElement;
        return array;

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
