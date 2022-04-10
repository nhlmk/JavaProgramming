package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int num = 90;
        int year = 01;
        String month = "";

        switch (num){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                month = "It is 31 days";
                break;

            case 4: case 6: case 9: case 11:
                month = "It is 30 days";
                break;

            case 2:
                month = year%4==0? year + " " + month + "It is 29 days":
                        year + " " + month + "It is 28 days";

            default:
                month = "Inv";

        }
        System.out.println(year + " " + month);
    }
}
