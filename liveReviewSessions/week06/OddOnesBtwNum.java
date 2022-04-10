package week06;

public class OddOnesBtwNum {

    public static void main(String[] args) {

        int i = 3;
        for (; i < 128 ; ) {
            if(i%2!=0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(129);
    }
}
