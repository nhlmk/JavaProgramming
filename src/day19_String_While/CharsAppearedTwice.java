package day19_String_While;

import java.util.Scanner;

public class CharsAppearedTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan. nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(each==ch){
                    count+=1;
                }
            }
           if(res.contains(ch+"")){
               continue;
           }
            if(count==2){
                res+=ch;
            }

        }
        System.out.println(res);
    }
}
