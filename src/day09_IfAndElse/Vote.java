package day09_IfAndElse;

public class Vote {
    public static void main(String[] args) {

        int age = 20;
        boolean vote = age > 15;
        if (vote) {
            System.out.println("can vote");
        } else {
            System.out.println(" can not vote ");
        }
    }
}