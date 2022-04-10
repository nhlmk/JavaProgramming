package day11_Switch_Scanner;

public class DaysInweek {

    public static void main(String[] args) {

        /*
        int number = 5;
        if(number==1){
            System.out.println("Monday");
            */

        String res = " ";
        char number = 'a';

        switch(number){


            case 'a':
                res = "Monday";
                break;


                case 2:
                res = "Tuesday";
                break;

            case 3:
                res = "Wednesday";
                break;

            case 4:
                res = "Thursday";
                break;

            case 5:
                res = "Friday";
                break;


            case 6:
                res = "Saturday";
                break;


            case 7:
                res = "Sunday";
                break;

            default:
                res = " Invalid";
                break;

        }
        System.out.println(res);
    }
}
