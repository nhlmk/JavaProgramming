package day25_CustomMethds_Overloading;

public class MethodsOverloading {
    public static void main(String[] args) {
        sumOfNumbers(3,9, 8);
        sumOfNumbers(3.4, 2.1, 43.9);
        System.out.println(sumOfNumbers(3.4, 2.1, 43.9));
    }
    public static int sumOfNumbers(int num1, int num2) {
        return num1+num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return sumOfNumbers(num1, num2)+num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }
}
