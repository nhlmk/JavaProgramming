package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("=========================");
        

        ArrayList< Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'b', 'c', 'd'));
        Collections.reverse(chars);
        System.out.println("chars = " + chars);

        System.out.println(" = ============================ " );
        ArrayList< Character> ch = new ArrayList<>();
        ch.addAll(Arrays.asList('a', 'b', 'a', 'k', 'k', 'k', 'b', 'c', 'd'));
        Collections.swap(list, 1, 3);
        System.out.println("ch = " + ch);

        System.out.println("list = " + list);

        System.out.println("+++++==+++++==+==");

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("==================");

        Collections.replaceAll(list, 2, 999);
        System.out.println("list = " + list);

        System.out.println(" =+======================== " );
        int frequency = Collections.frequency(ch, 'k');
        System.out.println("list = " + frequency);

    }
}
