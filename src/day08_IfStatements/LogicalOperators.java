package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 10;
        String citizen = "USA";
        boolean isEligible = age >= 19 && citizen == "UK";
        System.out.println("isEligible = " + isEligible);

        System.err.println("ooooooooooooooooooooooooooooooooooooooooooooo");

        String name1 = "Josh";

        int creditScore = 750;
        int age2 = 20;
        int income2 = 9000;

        boolean eligibility = creditScore >= 700 && age2 >= 18 && income2 >= 5000;
        System.out.println("eligibility = " + eligibility);

        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooo");

        int age3 = 45;
        char gender1 = 'F';

        boolean isEligible1 = age3 > 50 && (gender1 == 'F' || gender1 == 'M');
        System.out.println("isEligible1 = " + isEligible1);


        String name0 = "James";
        double gPA = 3.0;
        int famIncome = 120000;

        boolean isEligibleforSchoolarship = gPA > 3.2 || famIncome <1000;

        System.out.println("isEligibleforSchoolarship = " + isEligibleforSchoolarship);

        int score = 85;
        boolean passed = score > 50;
        boolean failed = !passed; // logical not operator is !
        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);





    }
}
