package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("age: ");
        int age = scan.nextInt();

        while((age<=1||age>=120)){
            System.out.print( "enter age again: ");
            age = scan.nextInt();
        }
        System.out.println("are you a us citisen");
        String ans = scan.next();

        while(!ans.equalsIgnoreCase("yes")&&!ans.equalsIgnoreCase("no")){

            System.out.println("enter again");
            ans = scan.next();

        }
        if(age>=18&&ans.equalsIgnoreCase("yes")){
            System.out.println("congrats you can vote");
        }else {
            System.out.println("Unf u cant vote");
        }
    }
}
