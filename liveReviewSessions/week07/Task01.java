package week07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        System.out.println("Enter a row number: ");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();

        for (int i = 1; i <= row ; i++) {
            int k = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k+=row -j;

            }
            System.out.println();
        }

        System.out.println("=======================");


        int row1 = scan.nextInt();

        for (int i = 1; i <= row1; i++) {
            int k = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k+= row1 -j;
            }
            System.out.println();


        }


    }
}
