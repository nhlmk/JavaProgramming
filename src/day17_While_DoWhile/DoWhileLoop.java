package day17_While_DoWhile;

public class DoWhileLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }
        System.out.println("=====================");
        int j = 0;
        while (j<5){
           j++;
            System.out.println(j);
        }
        System.out.println("=====================");
        int z = 0;
        do {
            System.out.println(z);
            z++;
        }while(z<5);
        }
    }
