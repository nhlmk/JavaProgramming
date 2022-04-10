package day03_EscapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        // In escape sequences \n starts a new line.

        System.out.println("Java \nPython and C#");
        System.out.println("Hello Cydeo. \nHow are you all today? \nToday we are going to learnt a new thing. \nOpen escape sequences pdf in your file.");

        // In escape sequences \t means tab button. For example;

        System.out.println("\tHello Cydeo. \tHow are you all today? \tToday we are going to learnt a new thing. \nOpen escape sequences pdf in your file.");

        // this \\ means one backslash in Escape Sequences.
        // For exmpl if you want to create four backslashes. you need to write 8 backslash.
        System.out.println("\\");

        // \"double quote in escape sequences.
        System.out.println("i said \"Well it is amazing\"");

    }
}
