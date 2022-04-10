package day34_GarbageCollection;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static {
        System.out.println(" static 0 " );
    }
    static {
        System.out.println(" static 1 " );
    }

    static {
        System.out.println(" static 1 ");
    }

    static{
        System.out.println(" static 2 ");
    }

}
