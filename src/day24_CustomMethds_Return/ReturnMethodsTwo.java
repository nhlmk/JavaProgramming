package day24_CustomMethds_Return;

public class ReturnMethodsTwo {
    public static void main(String[] args) {
        grade(200);
        System.out.println(grade(99));
        System.out.println("hello");
    }


    public static String grade(int score) {
        String result = "";

        if (score > 100 || score < 0) {
            result = "invalid";

        }

        result = (score > 90) ? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? ":D" : "F";
return result;
    }

}
