package day12_String;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        System.out.println(sentence.charAt(0) + " - " + sentence.charAt((sentence.length()-1)));

        System.out.println("============================================================");

        System.out.println("Enter a sentence: ");
        String a = scan.nextLine();

        System.out.println("Enter another sentence: ");
        String b = scan.nextLine();

        int lenghta = a.length();
        int lenghtb = b.length();

        if(lenghtb>lenghta){
            System.out.println(b);
        }else if(lenghta>lenghtb){
            System.out.println(a);
        }else{
            System.out.println("IVB");
        }

        System.out.println("-------------------------------------------------");

        System.out.println("Enter another sentence: ");
        String y = scan.nextLine();

        char yilk = y.charAt(0);
        char yson = y.charAt((y.length()-1));

        if(yilk == yson){
            System.out.println("First and last characters are the same. ");
        }else{
            System.out.println("First and last characters are NOT the same. ");
        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Enter a word. ");
        String w = scan.nextLine();

        System.out.println("Enter another: ");
String w1 = scan.nextLine();

char fw = w.charAt(0);
char fw1 = w1.charAt(0);

        System.out.println(fw + "-" + fw1);

    }
}
