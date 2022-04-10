package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        String password = new Scanner(System.in).nextLine();

        boolean r1 = password.length()>=8&& !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;

        char[] chars = password.toCharArray();

        for(char each : chars){

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else if(!Character.isSpaceChar(each)){
                r6 = true;
            }else{
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5 && !r6;
        System.out.println("isStrongPassword = " + isStrongPassword);

    }

}
