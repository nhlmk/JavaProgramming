package day09_IfAndElse;

public class LeapYear {
    public static void main(String[] args) {


        int num1 = 2000;

        boolean leapYear = num1 % 4 == 0;

        if (leapYear) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }
}
