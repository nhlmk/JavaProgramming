package week15;

public class ErrorExamples {
    /*
    normally we do not try to catch Error like the one below.
     */
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception handled.");
            System.out.println(e.getMessage());
        }
try {
    deathlyMethod();
}catch (StackOverflowError error){
    System.out.println(error.getCause());
    System.out.println(error.getMessage());
    System.out.println(error.getClass());
    error.printStackTrace();
}
    }

    static int counter = 0;
    public static void deathlyMethod (){
        System.out.println(counter++);
        deathlyMethod(); // we created infinite loop.
    }
}
