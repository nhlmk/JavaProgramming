package day15_ForLoop;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word.");
        String wrd1 = scan.nextLine();
        if(wrd1.charAt(0) == 'x') {
            System.out.println(wrd1.replaceFirst("x", "a"));
        }

        System.out.println("========================");
        System.out.println("enter word: ");
        String wrd2 = scan.nextLine();
        System.out.println(wrd2.replaceAll("x", "a")
                .replaceAll("X", "a"));


        System.out.println("==========================");
        System.out.println("Enter name:");
        String wrd3 = scan.nextLine();

        System.out.println("Enter surname: ");
        String wrd4 = scan.nextLine();

        wrd3 = wrd3.substring(0,1).toUpperCase() +
                wrd3.substring(1).toLowerCase();
        wrd4 = wrd4.substring(0,1).toUpperCase() +
                wrd4.substring(1).toLowerCase();

        System.out.println(wrd3 + " " +  wrd4);
    }
}
