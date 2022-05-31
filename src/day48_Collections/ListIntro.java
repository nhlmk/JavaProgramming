package day48_Collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list.get(0));



        List<Integer> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list1.get(0));



        List<Integer> list2 = new Vector<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list2.get(0));




        List<Integer> list3= new Stack<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list3.get(0));

        System.out.println("=============================");

        System.out.println("list3 (STACK) = " + list3);
((Stack<Integer>) list3).pop();

        System.out.println("list3 = " + list3);
        ((Stack<Integer>) list3).pop();
        System.out.println("list3 = " + list3);
    }

    public synchronized void method1(){

    }


}
