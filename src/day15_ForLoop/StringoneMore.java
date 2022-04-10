package day15_ForLoop;

public class StringoneMore {

    public static void main(String[] args) {
        String r = " ";

        boolean b = r.isEmpty();

        boolean c = r.isBlank();

        System.out.println(b + " " + c);

        System.out.println("=========");
String a = "cydeo";
String x = "CyDEo";

        System.out.println(a.equals(x));
        System.out.println(a.equalsIgnoreCase("ocDye"));

        System.out.println("===========");
        String q = "I love Java";
        System.out.println(q.contains("java"));

        System.out.println("==================");
String e = "WoodenSpoon";
        boolean m = e.startsWith("Wo");
        boolean n = e.endsWith("n");
        System.out.println(m);
        System.out.println(n);
    }
}
