package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries = { "Japan", "korea", "united states", "turkey"};

        //converting array to array list.
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p -> p.length()>=10);
        System.out.println("list = " + list);

        // converting array list to array
        countries = list.toArray(new String[0]);
       // System.out.println();
        System.out.println("countries = " + Arrays.toString(countries));



    }
}
