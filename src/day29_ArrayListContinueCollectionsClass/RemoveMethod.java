package day29_ArrayListContinueCollectionsClass;

import day42_Exceptions.utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
            }
        }
        System.out.println("list = " + list); */


        list.removeIf( p -> p < 5);
        System.out.println("list = " + list);

        System.out.println("==============================");

        ArrayList< Integer > list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf(p -> p %2==0);
        System.out.println("list2 = " + list2);

        System.out.println("====== IS PALINDROME ======");

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("anna", "cydeo", "racecar", "eye", "java"));

        name.removeIf(names -> !StringUtility.isPalindrome(names));
        System.out.println("name = " + name);


    }
}
