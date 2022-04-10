package day16_ForLoopStrPractice;

import java.util.Scanner;

public class DuplicateLetters {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        String res = "";

        for (int i = 0; i < str.length()-1; i++) {

            String ch = "" + str.charAt(i);
            if(!res.contains(ch)){
                res+=ch;
            }

        }

        System.out.println(res);
    }
}
