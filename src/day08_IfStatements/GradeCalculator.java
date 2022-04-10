package day08_IfStatements;

public class GradeCalculator {

    public static void main(String[] args) {

        int score = 10;

        boolean excellent = score >= 90 && score <= 100;
        boolean great = score >= 80 && !excellent;
        boolean c = score >= 70 && !excellent && !great;
        boolean f = score <= 59 && !excellent && !great && !c;

        if (excellent) {

            System.out.println("excellent = " + excellent);
        }
        if (great) {
            System.out.println("great = " + great);
        }
        if (c) {
            System.out.println("c = " + c);

        }
        if (f) {
            System.out.println("failed " + f);
        }
    }
}