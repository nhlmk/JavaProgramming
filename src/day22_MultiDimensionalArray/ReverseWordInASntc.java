package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseWordInASntc {

    public static void main(String[] args) {

        String sentence = "Today is pretty good day";
        String[] words = sentence.split(" ");

String reversedWord = "";
        for (int i = words[2].length() - 1; i >= 0; i--) {
            reversedWord += words[2].charAt(i);
        }
        System.out.println(reversedWord);
words[2]=reversedWord;
        System.out.println(sentence);
        System.out.println(Arrays.toString(words));
        for (String word : words){
            System.out.print(word + " ");
        }
    }
}
