package day51_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice04 {
    public static void main(String[] args) {
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("E", "F", "G"));
        ArrayList<String>  group3 = new ArrayList<>(Arrays.asList("K", "L", "M"));
        ArrayList<String>  group4 = new ArrayList<>(Arrays.asList("R", "F", "Y"));
        ArrayList<String>  group5 = new ArrayList<>(Arrays.asList("M", "F", "Z"));

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        System.out.println("groups = " + groups);

    }

}
