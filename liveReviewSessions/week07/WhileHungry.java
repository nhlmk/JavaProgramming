package week07;

public class WhileHungry {

    public static void main(String[] args) {

        boolean isHungry = true;

        int banana = 0;
        int countToFull = 3;

        while(isHungry){
            banana++;
            System.out.println(" banana \uD83C\uDF4C " + banana);

            if(banana==countToFull){
                System.out.println("had enough banana. back to study.");

                break;

            }
        }

    }
}
