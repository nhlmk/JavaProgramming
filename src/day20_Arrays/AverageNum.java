package day20_Arrays;

public class AverageNum {

    public static void main(String[] args) {

        int[ ] numbers = { 10, 20, 30 , 50, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNum = sum/numbers.length;
        System.out.println("averageNum = " + averageNum);
    }
}
