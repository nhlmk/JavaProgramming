package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElementsInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        Collections.swap(list, 0, list.size()-1);

        System.out.println("list = " + list);

        System.out.println("====================================");

        ArrayList< Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4));

        int size = list1.size();

        list1.removeAll(Arrays.asList(0));
        System.out.println("list1 = " + list1);

        int newSize = list1.size();
        int totalNumbersOfZero = size - newSize;

        System.out.println(totalNumbersOfZero);

        for (int i = 0; i < totalNumbersOfZero; i++) {
            list1.add(0);
        }
        System.out.println(list1);

        System.out.println("=============================");

        ArrayList<Integer> list3  = new ArrayList<>();
        list3.addAll(Arrays.asList(0,1,2,0,3,4,5,0,6,7,0));

        ArrayList< Integer> result = new ArrayList<>();

        for(Integer each : list3){
            if(each!=0){
                result.add(each);
            }
        }

        for (Integer each : list3){
            if(each==0){
                result.add(each);
            }
        }
        System.out.println("result = " + result);

        System.out.println("=======================");


        
        

        String str = "SASA$)#_@_DSf943902ds@#!DSFDS";
        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 0; i<str.length(); i++){
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);
letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);


        ArrayList<Character> digits = new ArrayList<>(chars);
digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacters = new ArrayList<>(chars);
        specialCharacters.removeAll(digits);
        specialCharacters.removeAll(letters);
        System.out.println("specialCharacters = " + specialCharacters);
        
    }
}
