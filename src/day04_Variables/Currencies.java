package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 0.074;
        double euro  = dollar * 1.14;
        double ruble = dollar * 0.013;
        double riyal = dollar * 0.27;

        System.out.println("1000 lira = " + lira + " dollar");
        System.out.println("1000 euro = " + euro + " dollar");
        System.out.println("1000 ruble = " + ruble + " dollar");
        System.out.println("1000 riyal = " + riyal + " dollar");

    }

}
