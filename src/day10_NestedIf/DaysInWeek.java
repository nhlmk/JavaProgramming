package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int number1 = 9;
        String result1 = (number1==1)?"Monday":(number1==2)?"Tuesday":
                (number1==3)?"Wednesday":(number1 ==4)?"Thursday":(number1==5)?"Friday":
                        (number1==6)?"Saturday":(number1==7)?"Sunday": "Invalid";
        System.out.println(result1);
    }
}
