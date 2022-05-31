package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,6,7,8,9));
        System.out.println("set = " + set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println("list = " + list);

        List<String> names = null;
       // System.out.println(names.size());

        System.out.println("===============================================");

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'A', 'B', 'C'));

        System.out.println("chars = " + chars);

        ((Stack)chars).pop();

        System.out.println("chars = " + chars);

        List<String> name = new LinkedList<>();
        name.addAll(Arrays.asList("Jim", "Jake", "Max", "Jake", "Jim"));

        ((LinkedList<String>)name).poll();
        System.out.println(name);
        ((LinkedList<String>)name).poll();
        System.out.println(name);

    }


}
