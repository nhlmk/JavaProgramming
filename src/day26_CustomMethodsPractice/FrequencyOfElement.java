package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int result = frequency(new int[] {2,3,4,-1,0,2,3,2}, -1);
        System.out.println("result = " + result);

        int resultC = frequency(new char[]{'a', '1', '=', '?', 'a' , 'a'}, 'a');
        System.out.println("resultC = " + resultC);

        int resultS = frequency(new String[]{"qwert", "yuio", "pasdf", "pasdf"}, "pasdf");
        System.out.println("resultS = " + resultS);

        int resultD = frequency(new double[]{2.3, 4.6, 2.3}, 2.3);
        System.out.println("resultD = " + resultD);
    }



    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static char frequency(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return (char) count;
    }

    public static int frequency(String[] array, String element){
        int count = 0;

        for (String each : array){
            if(each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }

    public static int frequency(double[] array, double element){
        int count = 0;

        for (double each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }


}
