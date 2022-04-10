package day10_NestedIf;

import java.util.Scanner;

public class TernariesInfo {

    public static void main(String[] args) {

        int n = 100;
        String result = " ";

        if(n%2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println("result = " + result);

        String result1 = (n%2!=0)?" Odd": " Even";
        System.out.println("result1 = " + result1);

        System.out.println("__________________________________________________");
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter age ");
        int age = scan.nextInt();
        scan.nextLine();

        String result2 = (age>=18)?"Can buy alcohol":"can not buy alcohol";
        System.out.println(result2);

        System.out.println("__________________________________________________");
        System.out.println("__________________________________________________");

        System.out.println("Enter number: ");
        int number0 = scan.nextInt();
        scan.nextLine();

        String result0 = (number0>0)?"Positive":(number0<0)?"Negative":"Zero";
        System.out.println(result0);

    }
}
