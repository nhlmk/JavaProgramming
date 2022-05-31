package day42_Exceptions;

class  FadyException extends RuntimeException{
public FadyException(String message){
    super(message);
}
public FadyException(){
    super("It is time for break");
}
}

class NoBreakException extends Exception{

}

public class CustomExceptions {
    public static void main(String[] args) {
       // throw new FadyException("break time");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }
}
