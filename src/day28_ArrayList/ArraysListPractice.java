package day28_ArrayList;

import java.util.ArrayList;

public class ArraysListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        System.out.println("array = " + array);
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i)*2);
        }
        System.out.println("array = " + array);

        System.out.println(" ===================== ");

        ArrayList<Character> chr = new ArrayList<>();

        chr.add('A');
        chr.add('A');
        chr.add('A');
        chr.add('A');

        int a = chr.indexOf('A');
        int b = chr.lastIndexOf('A');

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println(" = =  = = = = = = = = = =  ");

        boolean x = chr.contains('A');
        boolean y = chr.contains('Z');

        System.out.println("y = " + y);
        System.out.println("x = " + x);

    }
}
