package week15;

public class CheckedExceptionDemo{
    public static void main(String[] args) throws InterruptedException{
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        System.out.println("I will move on with my web automation.");
        Thread.sleep(5000);
        System.out.println("waited 5 more secs.");

    }
}
