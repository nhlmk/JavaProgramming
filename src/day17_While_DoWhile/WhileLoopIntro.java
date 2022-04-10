package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopIntro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first num");
        int i = scan.nextInt();

        System.out.println("second num");
        int j = scan.nextInt();

        System.out.println("math op");
        char ch = scan.next().charAt(0);

        while(!(ch=='-'||ch == '+')){
            System.out.println("inv. math op again: ");
            ch = scan.next().charAt(0);

        }
        System.out.println(ch=='+'? i+j:i-j);

    }
}
