package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        //int[] ints = removeElement(new int[]{2,1,2,3}, 2);
        int[] ints = {2,3,4,5};
        int index = 0;
        int[] result = removeElement(ints, index);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(result));
        
        String[] str = removeElement(new String[]{"qwe", "rty", "uio", "pasa"}, 3);
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        
        
    }

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
    
    
}
