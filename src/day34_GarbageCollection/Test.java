package day34_GarbageCollection;
import static day34_GarbageCollection.Circle.*;
import static day42_Exceptions.utilities.MathUtility.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);


        System.out.println("========");

        int i1 = sum(12, 23);
        int i2 = sum(98, 76);
        int r3 = subtraction(12, 8);
        int r4 = max(16, 5);

        System.out.println("r4 = " + r4);
        System.out.println("r3 = " + r3);
        System.out.println("i2 = " + i2);
        System.out.println("i1 = " + i1);

    }
}
