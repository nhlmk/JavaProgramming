package day17_While_DoWhile;

import java.util.Scanner;

public class PasswordUserName {
    public static void main(String[] args) {

        System.out.println("enter username (Cydeo)");
        String username = new Scanner(System.in).next();
        System.out.println("enter password Cydeo123");
        String password = new Scanner(System.in).next();

        if (username.equalsIgnoreCase("Cydeo") &&
                password.equalsIgnoreCase("Cydeo123")) {
            System.out.println("Success");
        } else {

            int attempt = 3;
            while (((!username.equalsIgnoreCase("Cydeo") &&
                    !password.equalsIgnoreCase("Cydeo123"))) && attempt>1) {

                System.out.println("wrong answer. you have " + --attempt + " chances left. ");
                System.out.println("enter username (Cydeo)");
                username = new Scanner(System.in).next();
                System.out.println("enter password Cydeo123");
                password = new Scanner(System.in).next();

            }
                    if (username.equalsIgnoreCase("Cydeo") &&
                            password.equalsIgnoreCase("Cydeo123")) {
                        System.out.println("Success");
                    } else {
                        System.out.println("account locked");
                        System.exit(0);
                    }
                }
            }


    }

