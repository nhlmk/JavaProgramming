package day49_Collections;

import java.util.*;
import java.util.function.IntFunction;

public class SetPractice2 {
    public static void main(String[] args) {


        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        //Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        // System.out.println("set1 = " + set1);
        //arr = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 200, 10, 300, 100, 10, 10));
        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("list = " + list);


        System.out.println("===================================");

        String[] array = {"A", "B", "A", "A", "c", "b", "e", "f", "b"};
        List<String> s = new ArrayList<>(Arrays.asList(array));
        s.addAll(Arrays.asList("k", "m", "s"));
        System.out.println("================================");

        Integer[] nums = {1, 1, 1, 2, 2, 3, 3, 2, 1, 1, 3, 4, 5, 1, 6, 7, 7, 8, 9};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        System.out.println("===============");

        String str = "aaaaaabbbbbccde";
        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }

        System.out.println(result);

        System.out.println("==============================");
        Set<String> name = new LinkedHashSet<>();
        name.addAll(Arrays.asList("Ahmet", "Mehmet", "Ali", "Ahmet", "Veli", "Ahmet"));
        System.out.println(name.toArray(new String[0])[2]);
        System.out.println(new ArrayList<>(name).get(3));

    }
}