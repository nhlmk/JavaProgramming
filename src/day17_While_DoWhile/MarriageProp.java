package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProp {
    public static void main(String[] args) {

        System.out.println("will u marry me? ");
        String ans = new Scanner(System.in).next();

        while(!ans.equalsIgnoreCase("no")&&!ans.equalsIgnoreCase("yes")){
            System.out.println(" inv answer try again: ");
            ans= new Scanner(System.in).next();
        }
        if(ans.equalsIgnoreCase("yes")){
            System.out.println("congrats");
        }else{
            System.out.println("shame on you");
        }
    }
}
