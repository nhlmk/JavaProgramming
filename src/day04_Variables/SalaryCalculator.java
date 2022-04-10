package day04_Variables;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly rate = 50 $ and weekly hours = 40 hours

        int HourlyRate = 50;
        int WeeklyHours = 40;
        int NumberOfWeeks = 52;

        int salary = HourlyRate * WeeklyHours * NumberOfWeeks;

        System.out.println(salary); // sout is the shortcut.

        System.out.println("NumberOfWeeks = " + NumberOfWeeks);
        System.out.println("WeeklyHours = " + WeeklyHours); // soutv is the shortcut.
        System.out.println("salary = $ " + salary);
        System.out.println("HourlyRate = $ " + HourlyRate);


        System.out.println("-------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");

        int num = scan.nextInt();
        scan.nextLine();

        System.out.println("Are you married");
        boolean isMarried = scan.nextBoolean();
        scan.nextLine();

        String salaryAfterTax = isMarried == false ? (num>=130_000)?num-num*35/100 + " is salary after tax"
                :(num>=100_000)?num-num*30/100 + " is salary after tax ":
                (num>=80_000)?num-num*25/100 + "is salary after tax":
                        num-num*20/100 + "is salary after tax":
                (num>=130_000)?num-num*30/100 + " is salary after tax"
                :(num>=100_000)?num-num*25/100 + " is salary after tax ":
                (num>=80_000)?num-num*20/100 + "is salary after tax":
                        num-num*15/100 + "is salary after tax";

        System.out.println(salaryAfterTax);


    }

}
