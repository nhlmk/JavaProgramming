package day14_Str;

import java.util.Scanner;

public class StrPractice {


    public static void main(String[] args) {

        String str1 = "         hello        world     hello      ";
        str1 = str1.trim();

        System.out.println(str1);

        System.out.println("=========================================================");

        String str2 = "Java Programming School";
        int n1 = str2.indexOf("mi");
        int n2 = str2.lastIndexOf("ho");

        System.out.println(n2);

        System.out.println( " ---------------------------------------------");

        String s  = "java java java java ";
        int firstA = s.indexOf('a');
        int thirdJ = s.indexOf('j');
        System.out.println(firstA + thirdJ);

        System.out.println("=======================================================");

        String sb = "Java is fun, I love learning Java.";
        String sb2 = sb.replace("Java", "Python");
        System.out.println(sb2);

        String ab = "jasminbrook@gmail.com";
        String ab2 = ab.replace("gmail", "Yahoo");
        System.out.println( ab2);

        String qw = "Java Java Python Python C# C# C++ C++ Python Python Python";
        String qw2 = qw.replace("Python", "" + qw.replace("", ""));
        System.out.println(qw2);

        String er = "Java is cool Java is art";
        String er2 = er.replace(" a", " cat");
        System.out.println(er2);

        String tr = "Java";
        String tr2 = tr.replaceFirst("a", "ebc");
        System.out.println(tr2);

        System.out.println("===============================================");
String op = "Java Cydeo";
String op2 = op.substring(0, 5);
        System.out.println(op2);

        String bv = "Java Programming Language";
        String bv2 = bv.substring(0, bv.indexOf(" "));
        String bv3 = bv.substring(bv.indexOf(" ")+1, bv.lastIndexOf(" "));
        String bv4 = bv.substring(bv.lastIndexOf(" ") + 1, bv.length());
        System.out.println("bv4 = " + bv4);
        System.out.println("bv3 = " + bv3);
        System.out.println("bv2 = " + bv2);

        String hj = "Python, ruby, C#";
        String hj1 = hj.substring(0, hj.indexOf(" "));
        String hj2 = hj.substring(hj.indexOf(" ") + 1, hj.lastIndexOf(" "));
String hj3 = hj.substring(hj.lastIndexOf(" ")+1, hj.length());
        System.out.println("hj3 = " + hj3);
        System.out.println("hj2 = " + hj2);
        System.out.println("hj1 = " + hj1);

        System.out.println("============================================");



        System.out.println("===========================================================");

        String gfd = "woodenspoon-";
        String gf = gfd.repeat(9);
        System.out.println(gf);

        String klm = "aysefatmahayriye";
        System.out.println(klm.repeat(30));


    }
}
