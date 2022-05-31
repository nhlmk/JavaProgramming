package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Daniel", 86);
        students.put("Jake", 90);
        students.put("Maria", 90);
        students.put("Daniel", 95);

        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());
        System.out.println("students.get(\"Daniel\") = " + students.get("Daniel"));

        students.replace("Maria", 50);
        System.out.println("students = " + students);
        
        students.remove("Jake");
        System.out.println("students = " + students);

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Aygun");
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        System.out.println(students.isEmpty());
        System.out.println("=========================");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);

        map1.clear();
        map2.clear();

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);

    }

}
