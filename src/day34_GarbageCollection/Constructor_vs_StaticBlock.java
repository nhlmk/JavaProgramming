package day34_GarbageCollection;

public class Constructor_vs_StaticBlock {



    public Constructor_vs_StaticBlock(){
        System.out.println("constructor");
    }
    public static void main (String[] kfc){
        System.out.println("main");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }

    static {
        System.out.println("static block");
    }

}
