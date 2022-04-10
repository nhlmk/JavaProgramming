package week07;

import java.util.Scanner;

public class DuplicatedLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int freq = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if(each==ch){
                    freq++;
                }


            }



    if(res.contains(ch + "")){
        continue;
    }

        if(freq>1) {
            res+=ch;
        }

        }

        System.out.println(res);

    }
}
