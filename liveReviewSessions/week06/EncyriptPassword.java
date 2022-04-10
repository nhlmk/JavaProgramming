package week06;

import java.util.Scanner;

public class EncyriptPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        String chr = scan.nextLine();
        String newPass = "";
        for (int i = 0; i < password.length(); i++) {
            newPass+= "" + password.charAt(i)+chr;

        }
        System.out.println(newPass);
    }
}
