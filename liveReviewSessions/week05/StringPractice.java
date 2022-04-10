package week05;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String email = scan.nextLine();

        String word1 = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String word2 = email.substring(0,email.indexOf("_"));
        String word3 = email.substring(email.indexOf("@")+1,email.indexOf(".") );

        String w1U = word1.toUpperCase().charAt(0) + word1.substring(1);
        String w2U = word2.substring(0,1).toUpperCase() + word2.substring(1);

        System.out.println("First name: " + w2U + "\nSecond name: " + w1U + "\nDomain: " + word3);

    }

}
