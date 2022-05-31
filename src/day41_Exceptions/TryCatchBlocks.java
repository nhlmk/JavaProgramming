package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("test started");

        try{
            System.out.println(9/0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Aritmethic exception was occurred");
        }



        System.out.println("test completed");

        System.out.println("=================");

        System.out.println("test2 started");
        int[] numbers = {1,2,3,4,5};

        try{
            System.out.println(numbers[200]);
            System.out.println("try block");
        }catch (RuntimeException e){
           e.printStackTrace();
         //  System.out.println(e.getMessage());
            //System.out.println("catch block");
           // System.out.println("null pointer exception.");
        }
        System.out.println("test2 completed");

        System.out.println("============");
        System.out.println("test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0));

        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("test 4 started");

        System.out.println("=========");
        System.out.println("hello");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("========");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
