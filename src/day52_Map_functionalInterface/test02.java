package day52_Map_functionalInterface;

public class test02 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String s1 : s.split("")) {
                System.out.println(s1);
            }
        };

        printEach.test("WoodenSpoon");


        MySecondFunctionalInterface<Integer> cube;
        cube = n -> System.out.println(n*n*n);
        cube.test(5);


    }

}
