package day11_Switch_Scanner;

import java.util.Scanner;

public class NameOfMonthWithSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month number");

        int num = scan.nextInt();
        String res = " ";

        switch(num){

            case 1:
                res = "Jan";
                break;

            case 2:
                res = "Feb";
                break;

            case 3:
                res = "Mar";
                break;

            case 4:
                res = "Apr";
                break;

            case 5:
                res = "May";
                break;

            case 6:
                res = "Jun";
                break;

            case 7:
                res = "Jul";
                break;

            case 8:
                res = "Aug";
                break;

            case 9:
                res = "Sep";
                break;

            case 10:
                res = "Oct";
                break;

            case 11:
                res = "Nov";
                break;

            case 12:
                res = "Dec";
                break;

            default:
                res = "Inv";

        }
        System.out.println(res);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Enter number");
        int num1 = scan.nextInt();
        String res1 = "";

        switch (num1){

            case 1:
                res1 = "One";
                break;

            case 2:
                res1 = "Two";
                break;

            case 3:
                res1 = "Three";
                break;

            default:
                res1 = "Inv";
        }

        System.out.println(res1);

        System.out.println("------------------------------------------------------------");

        char grade = 'A';
        String res2 = " ";

        switch (grade){
            case 'A':
                res2 = "Excellent";
                break;

            case 'B':
                res2 = "Great Job";
                break;

            case 'C':
                res2 = "Good";
                break;

            case 'D':
                res2 = "Passed";
                break;

            case 'F':
                res2 = "Failed";
                break;

            default:
                res2 = "Inv";

        }
        System.out.println(res2);

        System.out.println("-------------------------------------------------------------");

        char g = 'F';
        String r = "";

        switch (g){
            case 'A':
            case 'B':
            case 'C':
                case 'D':
                r = "PASSED";
                break;

            case 'F':
                r = "FAILED";
                break;

            default:
                r = "INV";
                break;
        }
        System.out.println(r);

    }
}
