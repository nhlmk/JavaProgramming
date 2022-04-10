package week05;

import java.util.Scanner;

public class Valid_email {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);


        System.out.println("==================================");
        System.out.println("Please enter a valid em-mail address.");
        String email1 = scan.nextLine();

        boolean result = true;

        int atSignIndex = email1.indexOf("@");
        int dotIndex = email1.lastIndexOf(".");

        if(atSignIndex<1||atSignIndex>=email1.length()-3||atSignIndex!=email1.lastIndexOf("@")){
            result = false;
        }
        if(dotIndex<1|| dotIndex == email1.length()-1||atSignIndex>dotIndex || atSignIndex+1 == dotIndex){
            result = false;
        }

        System.out.println(result);




}
}
