package day09_IfAndElse;

public class PassOrFailed {

    public static void main(String[] args) {

        int score = 75;

        boolean pass = score > 60;

        if (pass) {
            System.out.println(" you are passed ");
        } else {
            System.out.println(" you are failed");
        }
    }
}
