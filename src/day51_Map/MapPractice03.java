package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice03 {


    public static void main(String[] args) {


        Map<String , Integer> map = new LinkedHashMap<>();
        map.put("John",23000);
        map.put("Antony", 100000);
        map.put("Kelly", 11300);
        map.put("Dominica", 12000);

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;
        String name2 = "";
        int minSalary = Integer.MAX_VALUE;


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if(eachValue>maxSalary){
                maxSalary=eachValue;
                name1=eachKey;
            }
            if(eachValue<minSalary){
                minSalary=eachValue;
                name2=eachKey;

            }
        }
        System.out.println("name1 = " + name1 );
        System.out.println("name2 = " + name2);

        System.out.println("=================");
        int count = 0;
        for (Integer eachValue : map.values()) {
            if(eachValue>=10000&&eachValue<=200000){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
