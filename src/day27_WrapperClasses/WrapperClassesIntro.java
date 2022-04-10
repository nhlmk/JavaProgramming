package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {
        int num1 = 200;
        Integer n1 = num1; // autoboxing;
        int num2 = n1; // unboxing;
        System.out.println(num2);

        System.out.println("========================");
        Integer integerValue = 100;
        float longValue = integerValue;
        System.out.println(longValue);

        System.out.println("==================");
        int num3 = 200;
        Integer num4 = num3; // autoboxing;
        System.out.println(num4);

        System.out.println("=============");
        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;
        float a5 = b1;
        double a6 = b1;


        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " "  + a6);

        System.out.println("=================");

        Integer z = 200;
        Integer y = z; // autoboxing;
        int k = y;
        System.out.println("Integer y = " + y + "int k = " + k);

    }
}
