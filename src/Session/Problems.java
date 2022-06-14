package Session;

import java.util.Scanner;

public class Problems {

    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();
        System.out.println("Enter a palindrome word.");
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        if(reverse.equalsIgnoreCase(str)){
            System.out.println("Palindrome. ");
        }else{
            System.out.println("not Palindrome");
        }







    }
}