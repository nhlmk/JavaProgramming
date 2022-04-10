package day11_Switch_Scanner;

import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int radius = scan.nextInt();

        System.out.println("alan = " + 3.14*radius*radius + "\ncevre = " + 2*3.14*radius);

        System.out.println("=======================================================");

        int grade = scan.nextInt();

        System.out.println(grade>=0&&grade<=100? grade>=90? "Excellent": grade>=80? "great": grade>= 70?"good"
                : grade >=60? "passed": "failed" : "inv");

        System.out.println("=======================================================");

        double hourlyRate = scan.nextDouble();
        scan.nextLine();
        int workingHour = scan.nextInt();
        double stateTax = scan.nextDouble();
        double federalTax = scan.nextDouble();

        System.out.println("salary = " + hourlyRate*workingHour*36 + "total tax = " + stateTax + federalTax +
                "salary after tax = " + (hourlyRate*workingHour*36-stateTax+federalTax));



    }
}
