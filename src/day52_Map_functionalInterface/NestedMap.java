package day52_Map_functionalInterface;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(11,"SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Dev");
        map1.put(15, "PO");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Shay", 100000);
        map2.put("Holly", 12000);
        map2.put("Veronica", 130900);
        map2.put("Alex", 23000);
        map2.put("Ali", 3400);

        Map<Map<Integer, String>, Map<String , Integer>> mapMap =  new LinkedHashMap<>();
        mapMap.put(map1,map2);
        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapMap.entrySet()) {
            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) {
                System.out.println("entry = " + entry.getValue());
            }
            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) {
                System.out.println("entry = " + entry.getKey());
            }
        }
        



    }
}
