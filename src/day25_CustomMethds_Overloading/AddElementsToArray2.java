package day25_CustomMethds_Overloading;

import java.util.Arrays;

public class AddElementsToArray2 {

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 1, 1};
        numbers = addElement(numbers, 4);
        String[] names = { "Ali", "veli", "pelin"};
        names = addElement(names, "Keriman");
        double[] doubles = { 2.4, 4.4, 0.1, 8.9};
        doubles = addElement(doubles, 4.5);
        char[] chars = {'1', '3', '0', '=', '='};
        chars = addElement(chars, '<');
        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        System.out.println("doubles = " + Arrays.toString(doubles));
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        System.out.println("numbers = " + Arrays.toString(numbers));


    }



    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for(double each : array){
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for(String each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length+1];
        int i = 0;
        for(int each : array){
            result[i++] = each;
        }
        result [i] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for(char each : array){
            result[i++] = each;
        }
        result[i]=element;
        return result;
    }

}
