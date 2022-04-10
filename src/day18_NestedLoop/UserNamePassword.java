package day18_NestedLoop;

import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter username : ");
        String username = scan.nextLine();
        System.out.println("enter password: ");
        String password = scan.nextLine();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("successful log in. ");


        } else {
            for (int i = 0; i < 4; i++) {
                if (i <= 1) {
                    System.out.println("wrong. try again. ");
                    System.out.println("enter username : ");
                    username = scan.nextLine();
                    System.out.println("enter password: ");
                    password = scan.nextLine();
                } else if (i >= 3) {

                    System.out.println("account locked");
                    break;
                }if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("successful log in. ");
                    break;
            }

            }
            scan.close();
        }
    }
}