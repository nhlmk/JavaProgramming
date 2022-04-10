package day08_IfStatements;

public class DaysofMonth {

    public static void main(String[] args) {

        int month = 2;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days) {
            System.out.println("has28Days = " );
        }

        if (has30Days) {
            System.out.println("has30Days = " );
        }
        if (has31Days) {
            System.out.println("has31Days = " );
        }
    }
}
