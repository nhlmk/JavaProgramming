package day12_String;

import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String w = scanner.nextLine();

        int wLenght = w.length();


            if (wLenght == 0) {
                System.out.println("IT is empty");
            } else if (wLenght >= 3) {
                System.out.println("3 or more char");
            } else if (wLenght<3){
                System.out.println(w);
            }

        System.out.println("--------------------------------------");

        System.out.println("Enter a three letter word: ");
       String wrd = scanner.nextLine();
       int wrdl = wrd.length();
       char wrdc = wrd.charAt(1);

       if(wrdl == 3){
           switch (wrdc){
               case 'a':
                   System.out.println("cool word. ");

               default:
                   System.out.println("okay word ");
           }

       }else if (wrdl >= 3){
           System.out.println("too long word. ");
       }else{
           System.out.println("too short word");
       }

        System.out.println("============================================================");

        System.out.println("Enter first word: ");
String w1  = scanner.nextLine();

        System.out.println("Enter second: ");
String w2 = scanner.nextLine();

        System.out.println("Enter third" );
String w3 = scanner.nextLine();

int w1l = w1.length();
int w2l = w2.length();
int w3l = w3.length();

        System.out.println(w1l == w2l && w1l == w3l? "all word all same lenghts. ":
                w1l == w2l && w1l != w3l? "Some are same some are diff. ":
                        w1l == w3l && w1l != w3l? "\"Some are same some are diff. ": "all dif. ");

        System.out.println("=============================================================");

        String username = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.println("enter password: ");
        String inputPassword = scanner.nextLine();

        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("verified");
        }else{
            System.out.println("try again");
        }

        }
    }

