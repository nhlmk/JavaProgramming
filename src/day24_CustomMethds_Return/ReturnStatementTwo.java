package day24_CustomMethds_Return;

public class ReturnStatementTwo {

    public static void main(String[] args) {
        nameOfMonth(30);
    }

    public static void nameOfMonth(int monthNumber) {
        if(monthNumber<1||monthNumber>12){
            System.out.println("invalid");
            return;
        }

        if(monthNumber==1){
            System.out.println("JAn");
        }else if(monthNumber==2){
            System.out.println("feb");
        }else if(monthNumber==3){
            System.out.println("mar");
        }else if(monthNumber==4){
            System.out.println("apr");
        }else if(monthNumber==5){
            System.out.println("may");
        }else if(monthNumber==6){
            System.out.println("jun");
        }else if(monthNumber==7){
            System.out.println("jul");
        }else if(monthNumber==8){
            System.out.println("aug");
        }else if(monthNumber==9){
            System.out.println("sept");
        }else if(monthNumber==10){
            System.out.println("oct");
        }else if(monthNumber==11){
            System.out.println("nov");
        }else if(monthNumber==12){
            System.out.println("dec");
        }

    }
}
