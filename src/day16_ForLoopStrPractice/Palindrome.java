package day16_ForLoopStrPractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        String res = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            res += str.charAt(i);
        }

        if(res.equalsIgnoreCase(str)){
            System.out.println("Palindrome. ");
        }else{
            System.out.println("not Palindrome");
        }


    }
}
