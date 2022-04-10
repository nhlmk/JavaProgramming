package week06;

public class PrintAllLetters {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z' ; i++){
            System.out.print(i + " " );

        }
        System.out.println("==============");

        for(int j = 65; j <= 90; j++){
            System.out.print((char)j + " ");
        }


        System.out.println("==========");
    }
}
