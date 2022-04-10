package day05_Concelaration;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 100,
        secondNumber = 50;

        int addition = firstNumber + secondNumber,
        eksi = firstNumber - secondNumber, multiple = firstNumber * secondNumber,
                divided = firstNumber / secondNumber;

        System.out.println(" 100 + 50 = " + addition + "\n100 - 50 =" + eksi +
                "\n100 * 50 = " + multiple + "\n100 / 50 = " + divided);

    }
}
