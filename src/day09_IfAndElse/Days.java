package day09_IfAndElse;

public class Days {

    public static void main(String[] args) {

        int n = 2;
        String day;

        if (n == 1) {
            day = "monday";
        } else if (n == 2) {
            day = "tuesday";
        } else if (n == 3) {
            day = "wednesday";
        } else if (n == 4) {
            day = "thursday";
        } else if (n == 5) {
            day = "friday";
        } else if (n == 6) {
            day = "saturday";
        } else{
            day = "sunday";
        }
        System.out.println(day);
    }
}