package day17_While_DoWhile;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a str: ");
        String str = scan.nextLine();
        int freq = 0;

        while(str.contains("java")) {
            str = str.replaceFirst("java", "");
            freq++;
        }
        System.out.println(freq);
        System.out.println("===========");

        String catDog = scan.nextLine();
        int count = 0;

        while(catDog.contains("cat")){
            catDog=catDog.replaceFirst("cat", "");
            count++;
        }
        System.out.println(count);
        System.out.println("===========");


        int num = 0;
        String str2 = scan.nextLine();

        while(!str2.contains("cat")){
            System.out.println("enter another sentence: ");
            str2 = scan.nextLine();
        }
        while(str2.contains("cat")){
            str2 = str2.replaceFirst("cat", "");
           num++;
        }
        System.out.println("sentence contains cat. " + num);


    }
}
