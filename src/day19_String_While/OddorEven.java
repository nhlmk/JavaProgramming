package day19_String_While;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number: ");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("it is even number: ");
            } else {
                System.out.println("it is odd number.");
            }

            System.out.println("would you like to enter another number? ( yes/ no) ");
            scan.nextLine();
            String answer = scan.nextLine();

            if(!(answer.equalsIgnoreCase("yes")||
                    answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Entry. ");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {
                System.err.println("thank you for using our calculator. ");
                break;
            }


        }
    }
}