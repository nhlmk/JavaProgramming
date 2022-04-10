package day23_CustomMethds_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        func();
        System.out.println("=============");
        func2();
        System.out.println("=============");
        evenNums();
        System.out.println("=============");
        evenOrOdd(987);
        System.out.println("=============");
        age(1997, 25);
        System.out.println("=============");

    }

    public static void func() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    public static void func2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }

    public static void evenNums() {
for (int i = 0; i<11; i+=2){
    System.out.print(i + " ");
    System.out.println();
}
    }

    public static void evenOrOdd(int number) {
        if(number%2==0){
            System.out.println(number + " is even number. ");
        }else{
            System.out.println(number + " is odd number. ");
        }
    }

    public static void age(int birthYear, int age) {
        System.out.println("age is" + (birthYear-age));
    }

}
