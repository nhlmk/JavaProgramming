package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {
        ArrayList< Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,4,5,6,6,6,7));
        ArrayList< Integer> unique = new ArrayList<>();
        for(Integer each : list){
            int frequency = Collections.frequency(list, each);
            if(frequency ==1){
                unique.add(each);
            }
        }

        ArrayList< Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,2,3,4,4,5,6,6,6,7));
        ArrayList< Integer> unique1 = new ArrayList<>(list1);
        unique1.removeIf(p -> Collections.frequency(list1, p)>1);
        System.out.println("unique1 = " + unique1);


        System.out.println(unique);
    }



}
