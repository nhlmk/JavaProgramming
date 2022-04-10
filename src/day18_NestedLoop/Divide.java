package day18_NestedLoop;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("enter two dif numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int count = 0;

        while (num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count  + " is the answe with remainder of " + num1);



    }
}
