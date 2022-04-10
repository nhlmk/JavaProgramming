package day05_Concelaration;

public class Castings {

    public static void main(String[] args) {


        int averageScore = 20;
        byte num1 = (byte) averageScore;
        short num2 = (short) averageScore;
        int num3 = (byte) averageScore;
        long num4 = (long) averageScore;
        float num5 =  averageScore;
        double num6 = averageScore;

        int nu = 10%3;
        int xy = 20%6;

        System.out.println("num1=" +num1 + " num2=" + num2 + " num3=" + num3 + " num4=" + num4 +
                " num5=" + num5 + " num6=" +num6 + "nu" + nu + " xy= "+ xy);

    }
}
