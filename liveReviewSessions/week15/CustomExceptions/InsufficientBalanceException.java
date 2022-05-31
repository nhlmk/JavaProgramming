package week15.CustomExceptions;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){};
    public InsufficientBalanceException(String message){super(message);}

}
