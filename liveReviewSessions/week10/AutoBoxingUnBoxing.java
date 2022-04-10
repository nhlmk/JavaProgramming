package week10;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        int i1 = 100;
        Integer i2 = i1;//auto-boxing : from primitive to object type.

        Long i3 = (long) i1; // we have to cast it to long type. else it complains.


        Integer n1 = 300;
        int n2 = n1; // un-boxing : from obj to primitive.

        System.out.println("============");



    }
}
