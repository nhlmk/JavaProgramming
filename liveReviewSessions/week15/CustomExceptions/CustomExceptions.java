package week15.CustomExceptions;

public class CustomExceptions {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("class is going on for " + minutes + " minutes;");
        if(minutes>50){
            throw new BreakTimeException("It is break time");
        }
        System.out.println("lets continue the class another " + (50-minutes) + " minutes");


        double balance = 395.0;
        double itemPrice = 500.0;
        System.out.println("I have " + balance + " euros in my account, the item is " + itemPrice );
        if(itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined due to insufficient amount");
        }
    }
}
