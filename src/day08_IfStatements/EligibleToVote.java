package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Hannah";
        int age = 25;
        String country = "Canada";

        boolean eligible = age >= 18 && (country == "USA" || country == "Canada");

        if (eligible) {

            System.out.println("eligible = " + eligible);
        }
        if (!eligible) {
            System.out.println("not eligible = " + eligible);
        }


    }}