package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int[] ints = {32, 543, -2, -43, 32, 0};

        int[] rev = new int[ints.length];

        for (int i = ints.length-1, j=0 ; i >= 0; i--, j++) {
            rev[j] = ints[i];

        }
        System.out.println(Arrays.toString(rev));

        System.out.println("==================");

        int[] n1 = {2, 5, 7, 2, 6, 0};
        int[] n2 = {4, 6, 1};

        int[] total = new int[n1.length + n2.length];

int i = 0;
for(int each : n1){
    total[i++] = each;
}

for(int each : n2){
    total[i++] = each;
}
        System.out.println(Arrays.toString(total));

        System.out.println("=============Stringleri Birlestir=================");

        String[] isim = {"Ali", "Ayse", "Kirkdokuz", "Fatma"};
        String[] isim1 = {"Veli", "Hayriye"};
        String[] ogrenciler = new String[isim.length + isim1.length];

        int a = 0;
        for(String her : isim){
            ogrenciler[a++] = her;

        }
        for(String her : isim1){
            ogrenciler[a++] = her;

        }
        System.out.println(Arrays.toString(ogrenciler));

        System.out.println("===========charlari birlestir=============");

        char[] m = {'a', 'b', 'c'};
        char[] z = {'m', 'a', 'w'};

        char[] top = new char[m.length + z.length];

        int q = 0;

        for (char p : m) {
            top[q++]=p;
        }
        for (char p : z) {
            top[q++]=p;
        }
        System.out.println(Arrays.toString(top));

    }
}
