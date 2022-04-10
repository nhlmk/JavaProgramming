package day17_While_DoWhile;

import java.util.Scanner;

public class CharFrmStrng {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        String str2 = "java";
        int freq = 0;

        for (int i = 0; i <= str.length()-4 ; i++) {
            String ch = "" + str.charAt(i);
            if(str.substring(i,i+4).equalsIgnoreCase(str2)){
                ++freq;
            }
        }
        System.out.println("freq = " + freq);

    }
}
