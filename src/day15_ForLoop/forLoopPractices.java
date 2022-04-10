package day15_ForLoop;

import java.util.Scanner;

public class forLoopPractices {

    public static void main(String[] args) {

        for(int num = 55; num>0; --num ){
           if(num%2==0){
               System.out.print(num + " ");
           }
        }
        for(char a = 65 ; a<91 ; a+=1){
            System.out.print( a + " ");
        }
        for(char b = 'Z'; b>= 'A'; b --){
            System.out.print(" \n " + b + " ");
        }

        for(char x = 1; x<4; x+=1 ){
            System.out.print(x + " ");
        }

        System.out.println("======================");
for(int s=1; s<=100; s++){
    if( s%3 == 0 && s%5 != 0){
        System.out.print("FIN ");;
    }else if( s%5 == 0 && s%3!=0){
        System.out.print("RA ");
    }else if(s%15==0){
        System.out.print("FINRA ");
    }else {
        System.out.print(s + " ");
    }
}
double sum = 0;
        for (int i = 0; i < 101 ; i++) {
            sum += i;
        }
        System.out.println(sum );

        System.out.println("==========================");

    }
}
