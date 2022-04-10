package day11_Switch_Scanner;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        double num1 = 4.54, num2 = 42.4;
        char operator = '0';


        switch (operator) {
            case ('+'):
                System.out.println(num1 + num2);
                break;
            case ('-'):
                if (num1 > num2) {
                    System.out.println(num1 - num2);
                } else {
                    System.out.println(num2 - num1);
                }
                break;

            case ('/'):
                if (num1 > num2) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println(num2 / num1);
                }
                break;

            case ('*'):
                System.out.println(num1 * num2);

            default:
                System.err.println("INVALID");


        }

        System.out.println("----------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        String browserName = "safari";

        if (browserName == "chrome" || browserName == "edge" || browserName == "ie"
                || browserName == "safari" || browserName == "opera") {
            System.out.println(browserName + " browser is selected");
        } else {
            System.err.println("INV");
        }

        System.out.println("-----------------------------------------------------------");

        int num3 = 2;

        System.out.println(num3 == 0 ? "Zero" : num3 == 1 ? "One" : num3 == 2 ? "Two" : num3 == 3 ? "Three" :
                num3 == 4 ? "Four" : "INV");


        System.out.println("======================================================");
        byte gradeLevel = 3;

            if (gradeLevel >= 1 && gradeLevel <= 18) {

                switch (gradeLevel){
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("ElementarySchool");
                        break;
                        case 6: case 7: case 8:
                        System.out.println("MiddleSchool");
                        break;
                    case 9: case 10: case 11: case 12:
                        System.out.println("HighSchool");
                        break;
                    default:
                        System.out.println("College");

                }

        }else{
            System.out.println("Invalid");
        }

    }


}


