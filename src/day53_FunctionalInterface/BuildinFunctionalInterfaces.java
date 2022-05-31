package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuildinFunctionalInterfaces {
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer> contains = (a,b)->{
            boolean result = false;

            for(Integer each : a){

                if(each==b){
                    result=true;
                    break;

                }
            }

            return result;
        };

        Integer[] arr = {11,12,13};
        boolean r1 = contains.test(arr,11);
        System.out.println(r1);


        System.out.println("=================");

        BiPredicate<String, String> anagram = (a,b) -> {
            String[] arr1 = a.split("");
            String [] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };

        BiConsumer<String, Integer> printMultipleTimes = (s,n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java", 5);




    }
}
