package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("=== test 1 ===");

        System.out.println(" hello");
        Thread.sleep(3000);
        System.out.println("cydeo");

        System.out.println("test1 completed.");

        System.out.println("==== test 2 started ====");
        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("batch 25");
        System.out.println("=== test 2 completed ===");


    }

}
