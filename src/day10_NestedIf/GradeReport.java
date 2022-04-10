package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 10;
        String result = " ";

        if(score >= 0 && score <= 100){

            if (score >= 90 ){
                result = "Excellent";
            }else if( score >= 80){
                result = "Great";
            }else if ( score >= 70){
                result = "Good";
            }else if ( score >= 60){
                result = "Passed";
            }else{
                result = "failed";
            }

        }else{
            result = "Invalid number";
        }

        System.out.println(result);

        /*
        90 - 100 = excellent
        80 - 89 = great
        70 - 79 = good
        60 - 69 = passed
        0 - 59 = failed


         */





    }
}
