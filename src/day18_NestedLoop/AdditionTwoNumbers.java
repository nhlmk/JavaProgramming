package day18_NestedLoop;

import java.util.Scanner;

public class AdditionTwoNumbers {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a number: ");
            int n = scan.nextInt();
            System.out.println("enter another");
            int n1 = scan.nextInt();

            System.out.println("addition is : " + n + n1);

            System.out.println("would you like to continue: ");
            String a = scan.nextLine();

            while(!a.equalsIgnoreCase("no")&&!a.equalsIgnoreCase("yes")) {
                System.out.println("invalid try again. ");
                a = scan.nextLine();
            }
            if (a.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}