package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0,5);
        list.add(1, 3);
        list.add(2, 9);
        list.add(3, 0);
        list.add(4, 3);
        list.add(5, 0);

        ArrayList<Integer> tmp = new ArrayList<>();

        int max = 0;
        int min = 0;
        double sum = 0;

        for(Integer each : list) {

            int num = 0;

            if(each>max){
                max=each;
            }

            if(each<min){
                min=each;
            }

           sum+=each;
            sum/= list.size();

            for(Integer element : list){

                if( each==element){
                    num++;
                }
            }

            if(num==1){
                System.out.println(each);
break;
            }


        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + sum);

    }
}
