package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[ ] chars = { 'A', 'B', 'A', 'B', 'C', 'D'};


        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int freq = 0;

            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == ch){
                    freq++;
                }
            }

            if(freq==2){
                System.out.println(ch);
            }

        }
    }
}
