package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println( "enter a number");
            int n = scan.nextInt();

            if(n%2==0){
                System.out.println("it is an even number. ");
            }else{
                System.out.println("it is an odd number. ");
            }
            System.out.println("would you like to enter one more number? ");
            scan.nextLine();
            String a = scan.nextLine();



            while(!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
                System.out.println("enter again you like enter one more num?  ");
                a = scan.nextLine();


            }
            if(a.equalsIgnoreCase("no")){
                break;
            }




        }


    }
}
