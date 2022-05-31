package day52_Map_functionalInterface;

public class Test {

    public static void main(String[] args) {

        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println(n + " is an odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol = (age) -> {
            if (age >= 18) {
                System.out.println(age + " is eligible to buy alcohol");
            } else {
                System.out.println(age + " is not eligible to buy alcohol.");
            }
        };

        eligibleToBuyAlcohol.apply(30);


        MyFirstFunctionalInterface printCube;

        printCube = n ->
                System.out.println(n * n * n);

        printCube.apply(3);

        MyFirstFunctionalInterface divisibleBy3And5 = n -> {

        if (n % 15 == 0)
            System.out.println(n + " is divisible by 3 and 5");

    };

    }


}
