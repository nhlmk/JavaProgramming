package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    static String name;

    public FinalVariable(String birthday){
        this.birthday=birthday;
    }

    public static void main(String[] args) {
        final double pi = 3.14;
        final String name;
        name = "Java";

        System.out.println(name);
        System.out.println(pi);

        FinalVariable finalVariable = new FinalVariable("May/01");
        System.out.println(finalVariable.birthday);

        FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);

    }
}
