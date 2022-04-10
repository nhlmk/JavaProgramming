package day09_IfAndElse;

public class MinNum {

    public static void main(String[] args) {

        int num1 = 123, num2 = 23;
        boolean smaller = num1<num2;

        if(smaller){
            System.out.println(num1 + " is smaller than " + num2);
        }else{
            System.out.println(num2 + " is smaller than " + num1);
        }
    }
}
