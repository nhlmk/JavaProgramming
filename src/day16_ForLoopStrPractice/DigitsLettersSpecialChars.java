package day16_ForLoopStrPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();
        String digits = "";
String letters = "";
String special = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

           if(ch>='0'&&ch<='9') {
               digits+=ch;

            }  else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){

                   letters+=ch;

           }else {
                   special += ch;
           }


        }

        System.out.println("special = " + special);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}