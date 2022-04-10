package day17_While_DoWhile;

import java.util.Scanner;

public class BranchIfStatements {

    public static void main(String[] args) {

        for (char i = 'a'; i < 'z'; i++) {

            System.out.print(i + " ");

            if(i== 'e') {
                break;
            }
        }
        System.out.println("===============");

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter number: ");
            int a = scan.nextInt();

            if( a < 9 ){
                break;
            }
        }

    }
}
