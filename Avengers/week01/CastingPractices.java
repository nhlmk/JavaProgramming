package week01;

import week08.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class CastingPractices {

    public static void main(String[] args) {

        byte b = 10;
        short s = b;

        double d = 5.3;
        int i = (int) d;


    }


    public static void firstTwoChars(String str){
        System.out.println(str.toUpperCase().substring(0,2));
    }

    public static String firstTwoChars2(String str){
        str = str.toUpperCase();
        String s = ""+ str.charAt(0)+str.charAt(1);
        return s;

    }

    public static String firstTwoChars1(String str){
        char[] charArr = str.toCharArray();
        return ""+ charArr[0]+charArr[1];
    }

    public static String firstTwoChars3(String str){
        char[] charArr = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(Character each : charArr){
            list.add(each);
        }
        String s = "" + list.get(0)+list.get(1);
        return s.toUpperCase();
    }

}
