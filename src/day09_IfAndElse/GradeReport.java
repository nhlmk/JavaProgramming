package day09_IfAndElse;

public class GradeReport {

    public static void main(String[] args) {

        int n = 53;
        String grade;

        if(n <= 20){
            grade = "F";
        }else if(n>20 && n <=40){
            grade = "D";
        }else if(n>40 && n<=60){
            grade = "C";
        }else if(n>60 && n<=80){
            grade = "D";
        }else{
            grade = "A";
        }
        System.out.println("grade = " + grade);
    }
}
