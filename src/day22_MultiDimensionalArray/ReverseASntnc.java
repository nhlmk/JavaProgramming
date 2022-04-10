package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseASntnc {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn java";
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence+=words[i]+" ";
        }
        System.out.println(reversedSentence);
    }
}
