package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println("list = " + list);

        int num = 1;
        list.remove(num);
        System.err.println("list = " + list);

        Integer num2 = 400;

        boolean r = list.remove(num2);
        System.err.println("list = " + list);
        System.out.println("r = " + r);

        list.clear();
        System.out.println("list clear = " + list);

        System.out.println(" = = = = = = = = = = = = = = = = = " );

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

    }
}
