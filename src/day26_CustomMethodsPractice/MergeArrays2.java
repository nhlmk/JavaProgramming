package day26_CustomMethodsPractice;

public class MergeArrays2 {


    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            result[i++] = each;
        }
        for (int each : array2) {
            result[i++] = each;
        }
        return result;

    }

    public static double[] merge(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];
        int i = 0;
        for (double each : array1) {
            result[i++] = each;
        }
        for (double each : array2) {
            result[i++] = each;
        }
        return result;
    }

    public static char[] merge(char[] array1, char[] array2) {
        char[] result = new char[array1.length + array2.length];
        int i = 0;
        for (char each : array1) {
            result[i++] = each;
        }
        for (char each : array2) {
            result[i++] = each;
        }
        return result;


    }

    public static String[] merge(String [] array1, String[] array2) {
        String[] result = new String[array1.length + array2.length];
        int i = 0;
        for (String each : array1) {
            result[i++] = each;
        }
        for (String each : array2) {
            result[i++] = each;
        }
        return result;


    }


}
