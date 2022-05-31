package day43_Abstraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_vs_Throws {
    public static void main(String[] args) {
        int score= new Scanner(System.in).nextInt();
        if(score<0 || score > 100){
            throw new RuntimeException("InvalidScore : " + score);
        }
        if(score>90){
            System.out.println("A");
        }else if(score>80){
            System.out.println("B");
        }else{
            System.out.println("Invalid");
        }
       method1();
    }

    public static void method1(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
