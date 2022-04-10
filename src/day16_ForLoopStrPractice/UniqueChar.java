package day16_ForLoopStrPractice;

import java.util.Scanner;

public class UniqueChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){
    res += ch;
            }

        }
        System.out.println(res);

    }
}
