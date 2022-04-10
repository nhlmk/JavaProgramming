package day18_NestedLoop;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("enter age: ");
            int age = scan.nextInt();

            while(!(age>=16&&age<=120)){
                System.out.println("invalid try again age");
                age = scan.nextInt();
            }
            scan.nextLine();
            System.out.println("would you like to continue? yes no");
            String cont = scan.nextLine();
            while(!(cont.equalsIgnoreCase("no")||
                    cont.equalsIgnoreCase("yes"))){
                System.out.println("inv entry. would you like to continue? yes no ");
                cont = scan.nextLine();

            }
            if(cont.equalsIgnoreCase("no")){
                break;
            }

            }
        scan.close();
        }
    }

