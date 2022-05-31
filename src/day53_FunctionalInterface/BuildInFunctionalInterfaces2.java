package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiFunction;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        for(Map.Entry<String,String> entry: scrumTeam1.entrySet()){
            String k = entry.getKey();
            String v = entry.getKey();
        }

        scrumTeam1.forEach((k,v)-> System.out.println(k+ "k" + "v" + v));

        BiFunction<Integer,Integer,Integer> maxNum = (a,b) -> {

          return a>b?a:b;
        };

        int max = maxNum.apply(5,10);
        System.out.println(max);


        BiFunction<int[],int[], List<Integer>> merge = (x,y) -> {
          List<Integer> result = new ArrayList<>();
          return result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1,arr2);

        System.out.println("============");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (j,k) -> {
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < j.size(); i++){
                map.put(j.get(i), k.get(i));
            }
            return map;
        };

      //  List<String> names = new ArrayList<>(Arrays.asList("Loya", "Sena"))


    }
}
