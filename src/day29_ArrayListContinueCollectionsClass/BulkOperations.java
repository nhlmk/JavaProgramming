package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(9,2,4,5,7,5,4,2));

        System.out.println(list);

      //  list.removeAll(Arrays.asList(2,4,5));
        System.out.println(list);

       // list.retainAll(Arrays.asList(9,7,2));
        System.out.println(list);


        System.out.println(list.containsAll(Arrays.asList(2)));

        System.out.println("+++++++++++++++++++++++++++++=");

        int[] arr = {1,2,3,4,5,6};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println(list3);




    }


    public static ArrayList< Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
