package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("==== push-up started. ====");
        for (int i = 0; i <= 5; i++) {
            System.out.print("\rPush up " + i);
            /* try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            } */

            sleep(1.5);
        }
        System.out.println("\n==== push-up finished. ====");

        System.out.println(" =========== ");

        System.out.println("==== pull up started ====");

        for (int i = 0; i <= 10; i++) {
            System.out.print("\rPull up " + i);
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n ==== pull up completed ====");
    }

    public  static  void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
