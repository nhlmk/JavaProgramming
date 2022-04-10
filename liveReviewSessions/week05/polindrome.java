package week05;

import java.util.Scanner;

public class polindrome {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(1) + word.charAt(0));
    }
}
