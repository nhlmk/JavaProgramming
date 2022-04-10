package day12_String;

import java.util.Locale;
import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Your name ");
String firstName = scan.nextLine();
        System.out.println("Your surname: ");
        String surname = scan.next();

char f = firstName.charAt(0);
char l = surname.charAt(0);
int lenght = firstName.length() + surname.length();

        System.out.println(firstName.toUpperCase() + surname.toLowerCase());




    }
}
