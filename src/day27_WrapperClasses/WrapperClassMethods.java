package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str = "123";
       int as = Integer.parseInt(str);
        System.out.println(as+1);
        System.out.println(str+1);

        System.out.println("=========");

        String str1 = "2.3";
        double num = Double.parseDouble(str1);
        System.out.println(str1+1);
        System.out.println(num+1);

        System.out.println("=================");

        double max = Double.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        System.out.println("============");

        String s1 = "maybe";
        Boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);

        System.out.println("===============");

        String str0 = "123";
        int str00 = Integer.valueOf(str0);
        System.out.println(str00 + 1);

        System.out.println("============");
        String abc = "2.4";
        Double abc0 = Double.valueOf(abc);
        System.out.println(abc0 + 1);

        System.out.println("===========");

        char ch1 = '=';
        Boolean a = Character.isDigit(ch1);
        System.out.println(a);

        char chq = '.';
        boolean q = Character.isLetter(chq);
        System.out.println(q);

        boolean w = !Character.isLetterOrDigit(ch1);
        System.out.println(w);

        boolean e = Character.isLowerCase(chq);
        System.out.println(e);

        boolean r = Character.isSpace(chq);
        System.out.println(r);

        System.out.println("=================");

        String t = "1m2n3b543b7vb";
        int sum = 0;
        for(char each : t.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);

    }
}
