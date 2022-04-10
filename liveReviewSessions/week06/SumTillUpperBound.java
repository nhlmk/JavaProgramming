package week06;

import java.util.Scanner;

public class SumTillUpperBound {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("enter numb1");
        int n  = new Scanner(System.in).nextInt();
        int i = 0;
        int sum = 0;

        for (; i <= n ; i++) {
            sum+=i;

        }
        System.out.println(" = " + sum);

        System.out.println("enter numb");
        int upperbound = scan.nextInt();
        int top = 0;
        boolean check = true;
        for(; check; ){
            if(upperbound >= 1){
                for(int z = 1; z<= upperbound; z++){
                    top+=z;
                }
                check = false;
            }else{
                System.out.println("Please enter another number: ");
                upperbound = scan.nextInt();
                check = true;
            }
        }
        System.out.println(" top = " + top);
    }
}
