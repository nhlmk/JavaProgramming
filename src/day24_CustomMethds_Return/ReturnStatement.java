package day24_CustomMethds_Return;

import java.util.Enumeration;

public class ReturnStatement {
    public static void nameOfDay(int number) {
        if(number<1||number>7){
            return;
        }

        if (number==1){
            System.out.println("mon");
        }else if(number==2){
            System.out.println("tue");
        }else if(number==3){
            System.out.println("we");
        }else if(number==4){
            System.out.println("thur");
        }else if(number==5){
            System.out.println("fri");
        }

    }

    public static void main(String[] args) {
        nameOfDay(10);
    }

}
