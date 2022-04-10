package week10;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            arr.add(i * 2);


        }
        System.out.println(arr);

        System.out.println("===================");

        String str = "123";
        System.out.println(str + 1);

        int num = Integer.parseInt(str);
        System.out.println(num + 1);

        String price = "$ 27.16";
        price = price.substring(2);

        double priceInDouble = Double.parseDouble(price);

        System.out.println(priceInDouble);

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2 + 1);

        System.out.println("============");


        char ch = 120;

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);
        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);


        System.out.println("===========");

        String q = "a1s2d3f4";
        int sum = 0;

        for (char each : q.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("============");

        int mnum = Integer.max(3, 5);
        System.out.println(mnum);

        System.out.println("===== ====== ===== ===== ===== ====");

        String p = "432jkfdl#@%21dskfkjhi14389few";

        String letters = "";
        String upperCase = "";
        String lowerCase = "";
        String digits = "";
        String specs = "";

        for (char each : p.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;

                if (Character.isUpperCase(each)) {
                    upperCase += each;
                } else {
                    lowerCase += each;
                }
            } else if (Character.isDigit(each)) {
                digits += each;

            } else {
                specs += each;
            }


        }

        System.out.println("specs = " + specs);
        System.out.println("digits = " + digits);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("upperCase = " + upperCase);
        System.out.println("letters = " + letters);
    }
}