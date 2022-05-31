package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a number : ");
            int num = scanner.nextInt();
            System.out.println("you entered : " + num);

        }catch (InputMismatchException e){
            System.out.println("you entered invalid value");
        }finally {
            scanner.close();
            System.out.println("finally block run always");
        }
    }
}
