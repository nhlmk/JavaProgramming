package day10_NestedIf;

public class NestedIntro {

    public static void main(String[] args) {

        int score = 1;

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println(" Passed");
            } else {
                System.out.println(" Failed ");
            }
        } else {
            System.out.println("invalid");
        }

        int age = 10;
        boolean hasId = false;

        if (hasId = true) {

            if (age >= 18) {
                System.out.println("Buy alcohol");
            } else {
                System.out.println("age restriction can not buy it");
            }


        } else {
            System.out.println("withoud id can not buy it");
        }

        int number1 = 45;

        if(number1 >= 1 && number1 <= 7){

            if(number1 == 1){
                System.out.println("Monday");
            }else if(number1 == 2){
                System.out.println("Tuesday");
            }else if(number1 == 3){
                System.out.println("Wednesday");
            }else if(number1 == 4){
                System.out.println("Thursday");
            }else if(number1 == 5){
                System.out.println("Friday");
            }else if (number1 == 6){
                System.out.println("Saturday");
            }else if ( number1 == 7){
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid number");
        }






    }
}