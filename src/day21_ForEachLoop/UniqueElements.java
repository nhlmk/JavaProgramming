package day21_ForEachLoop;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Ali", "Veli", "Kirkdokuz", "elli"};

        for (String each : words) {
        int count = 0;
        for (String element : words) {
            if (element.equalsIgnoreCase("Elli")) {
                count++;

            }

        }

            if(count==1){
                System.out.println(each);

            }

        }

        System.out.println("===============================");

        String abc = "Java is a pain killer? is it so? mayyyybee";
        char[] charz = abc.toCharArray();

        System.out.println(Arrays.toString(charz));

        for(char each : charz){
            System.out.println(each);
        }


        System.out.println("=============================");

        String wrdz = "heart";
        String wrdz1 = "earth";

        char[] wr1 = wrdz1.toCharArray();
        char[] wr = wrdz.toCharArray();

        Arrays.sort(wr1);
        Arrays.sort(wr);

        System.out.println(Arrays.toString(wr));
        System.out.println(Arrays.toString(wr1));

boolean eq = Arrays.equals(wr1, wr);

        System.out.println(eq);

        System.out.println("===================");

        String sentence = "I love. Java, I love C#. But. Python more. ";
        String[] wrds = sentence.split( "\\. ");

        System.out.println(Arrays.toString(wrds));

        System.out.println("========================");

        String email = "wooden_spoon@cydeo.com";
        String[] arr = email.split( "@");
        System.out.println(Arrays.toString(arr));

        System.out.println("============================");

String[] yh7 = {"Abc", "cxd", "fds", "rwe", "jhgt"};

        for (String o : yh7) {
            String initial = o.charAt(0) + "" + o.charAt(o.indexOf(" ")+1);
            System.out.println(initial);
        }

        for(String e : yh7){
            String reversed = "";

            for (int i = e.length()-1; i >= 0 ; i--) {
                reversed += e.charAt(i);

            }
            System.out.println(reversed);


        }

        }


}
