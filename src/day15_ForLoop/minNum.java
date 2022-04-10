package day15_ForLoop;

import java.util.Scanner;

public class minNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 32432;

        for (int i = 0; i < 5; i++) { // if i -- means bugloop.
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if(num<min){
                min=num;
            }
        }
        System.out.println(min);

        String a = "fds";

    }
}
