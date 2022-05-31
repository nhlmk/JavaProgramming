package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaad";
        String[] arr = str.split("");
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, freq );
        }

        System.out.println("result = " + result);

    }
}
