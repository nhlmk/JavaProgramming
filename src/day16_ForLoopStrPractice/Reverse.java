package day16_ForLoopStrPractice;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String reverse = "";

        for (int i = input.length()-1; i >= 0 ; i--) {
            reverse += input.charAt(i);

        }
        System.out.println(reverse);

    }
}
