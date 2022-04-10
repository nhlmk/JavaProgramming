package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {

    public static void main(String[] args) {


        String[] days = {"Monday", "Tuesday", "Wednesday"};
        days[0] = "Pazar";
        System.out.println(Arrays.toString(days));

        int number = 2;
        if(number<1||number>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-2]);
    }
}
