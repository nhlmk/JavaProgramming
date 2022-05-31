package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);

        };

        boolean result = isPalindrome.test("Java");
        System.out.println("result = " + result);

        Predicate<Integer> isEven = p -> p%2==0;

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,45,6,6));
        list.removeIf(isEven);
        System.out.println("list = " + list);

        List<String > names = new ArrayList<>(Arrays.asList("Eve", "Anna", "Karen", "susanne", "Alex", "Carla"));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        Consumer<String> printEach = s -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("HAYIR SORAMAZSINIZ SEKLINDE ESPIRILER");

        System.out.println(" =============== ");
        
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,12,3,4,5));
       list2.forEach(p-> {if(p%2==0)System.out.println("p = " + p);});

       List<String> employees = new ArrayList<>();
       employees.addAll(Arrays.asList("Anel", "Bella", "Lisa", "Jim", "Alex"));
       employees.forEach(p -> System.out.println(p.charAt(0) + " : " + p.charAt(p.length()-1)));

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result1 = new ArrayList<>();
            for (int each : a) {
                result1.add(each);
            }
            return result1;
        };
        int[] arr = {1,2,3,4,5,12,3};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("==============");

    }

}
