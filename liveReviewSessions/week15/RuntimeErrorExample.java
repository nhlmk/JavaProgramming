package week15;

import java.util.Scanner;

public class RuntimeErrorExample {

    public static void main(String[] args) {
        System.out.println("Hello");
        int x = 5;
        Scanner scanner =new Scanner(System.in);
        int y = scanner.nextInt();

        try {
            System.out.println(x/y);
        }catch (Exception e ){

        }
        System.out.println("how are you today?");
        System.out.println("Some more lines of code.");

    }
}
