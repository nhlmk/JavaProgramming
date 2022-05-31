package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        int[] arr = {11,2,2,11,3,3,4,4,5,5};
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));


        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));
list1 = list1.stream().limit(5).skip(3).collect(Collectors.toList());
        System.out.println("list1 = " + list1);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        days = days.stream().map(p -> p.substring(0,4)).collect(Collectors.toList());
        System.out.println(days);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        List<Integer> evens = list2.stream().filter(p -> p%2==0).collect(Collectors.toList());
        System.out.println(evens);


    }
}
