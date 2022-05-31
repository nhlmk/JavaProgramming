package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {
    public static void main(String[] args) {

        List<String > name = new ArrayList<>();
        name.addAll(Arrays.asList("ahmet", "Alice", "Eric", "Ahmet", "Veronica","ahmet", "Tom", "Alice", "Ahmet", "Veronica"));

       // name.removeAll(Arrays.asList("Ahmet"));
      //  System.out.println("name = " + name);

        Iterator<String> it = name.iterator();

     /*   for(Iterator<String> i = name.iterator(); i.hasNext();){
            if(i.next().equalsIgnoreCase("ahmet")){
                i.remove();
            }
        }
        */

        name.removeIf(p -> p.equalsIgnoreCase("ahmet"));

        System.out.println("name = " + name);

       // while (it.hasNext()){
     //       if(it.next().equalsIgnoreCase("ahmet")){
      //          it.remove();
     //       }
      //  }

     //   System.out.println("it = " + name);
    }
}
