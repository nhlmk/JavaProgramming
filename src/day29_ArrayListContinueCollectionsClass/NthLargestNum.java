package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNum {


    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        
        int n = 4;

        for (int i = 0; i < n; i++) {
            list.removeIf(p -> Collections.max(list)==p);
        }
        int max = Collections.max(list);

        System.out.println("max = " + max);
        
        
    }
}
