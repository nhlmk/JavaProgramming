package day53_FunctionalInterface;


public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFuncionalInterface<String> stringReverse =
                s -> {
            String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("WoodenSpoon");

        System.out.println("result = " + result);


    }
}
