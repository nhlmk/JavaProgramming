package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int grade = 61;

        String score = ( grade > 0 && grade <100)? (grade > 90 )? "Excellent" :
                ( grade > 80)? "Great ": ( grade > 70)? " Good":
                        (grade > 60)? " passed" :"failed":"invalid";
        System.out.println(score);
    }
}
