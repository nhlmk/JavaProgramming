package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("David", "Ahmed", "Daniel", "Shay"));
        employees.retainAll(Arrays.asList("David", "Ahmed"));

        System.out.println("employees = " + employees);

        System.out.println("------------------------------");
        String [] names = { "Marry", "Monica", "Hailey", "Jason"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p -> p.charAt(0)=='M');
        System.out.println("list = " + list);
        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));


    }
}
