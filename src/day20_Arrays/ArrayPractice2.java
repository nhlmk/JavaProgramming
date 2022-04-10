package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        /*char[] letter = new char[26];

char ch = 'A';
        for (int i = 0; i <letter.length ; i++, ch++) {
            letter[i] = ch;
        }
        System.out.println(Arrays.toString(letter));
*/
        System.out.println("===========================");

        char[] letter = new char[26];


        char ch = 'Z';

        for (int i = 0; i < letter.length; i++, ch--) {
            letter[i] = ch;
        }
        System.out.println(Arrays.toString(letter));
    }
}
