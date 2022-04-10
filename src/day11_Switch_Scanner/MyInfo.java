package day11_Switch_Scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Gender: F&M");
        String gender = scan.next();
scan.nextLine();
        System.out.println("Fullname: ");
        String fullName = scan.nextLine();

        System.out.println("Phone number: ");
        long phoneNumber = scan.nextLong();
scan.nextLine();
        System.out.println("Zip code: ");
        int zipCode = scan.nextInt();
scan.nextLine();
        System.out.println("School Name: ");
        String schoolName = scan.nextLine();

        System.out.println("City Name: ");
        String cityNAme = scan.nextLine();

        System.out.println("State Name: ");
        String stateName = scan.next();
scan.nextLine();
        System.out.println("Buliding Number: ");
        int buildingNumber = scan.nextInt();
scan.nextLine();
        System.out.println("Street Name: ");
        String streetName = scan.nextLine();

        System.out.println(" 1) "+ fullName + " 2) "+  age + " 3) "+ gender +" 3) "+ phoneNumber + " address = " + buildingNumber
        + " " +  streetName + " " + cityNAme + " " + stateName + " " + zipCode + " " + schoolName);

    }
}
