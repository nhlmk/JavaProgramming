package week10;

public class DiffBtwMaxAndMin {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6,7, 8};
            System.out.println(diff(arr));
        }

    public static int diff(int[] array){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int each : array){

            if(each>max ){
                max=each;
            }

            if(each<min){
                min = each;
            }
        }
        return max-min;

    }
}
