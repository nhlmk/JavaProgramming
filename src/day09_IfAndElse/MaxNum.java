package day09_IfAndElse;

public class MaxNum {

    public static void main(String[] args) {

        int num1 = 15, num2 = 20;

        boolean bigger = num1 > num2;

        if (bigger) {
            System.out.println(num1 + " is bigger than " + num2);
        } else {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }
}
