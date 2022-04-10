package week07;

import java.util.Scanner;

public class letterAndCountOfLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String res = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(each==ch){
                    count++;
                }
            }

            if(res.contains("" + ch)){
                continue;
            }

            res+=ch;
            res+=count;

        }
        System.out.println("res = " + res);

    }
}










