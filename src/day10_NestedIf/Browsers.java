package day10_NestedIf;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

        String res = "safari";

        String browserName = (res == "safari" || res == "opera" || res == "ie" || res == "edge"
                || res == "chrome")? res + " is a valid browser": res + " is invalid browser";

        System.out.println(browserName);

        System.out.println("--------------------------------------------------------------");

        int num = 5;

        String number = (num == 1)? "One": (num == 2)? "Two": (num == 3)? "Three":
                (num == 4)?"Four": (num == 5)? "Five": (num == 6)? "Six": (num== 7)? "Seven"
                        :(num == 8)? "Eight": (num==9)? "Nine": "Invalid";

        System.out.println(number);



    }
}
