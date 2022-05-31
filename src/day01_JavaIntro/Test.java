package day01_JavaIntro;

import day42_Exceptions.utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);
        String reverse = StringUtility.reverse(str);
        System.out.println(reverse);
        boolean palindrome = StringUtility.isPalindrome(str);
        System.out.println(palindrome);
        System.out.println("=======");
String a = "aaabbbhhvvjde";
String nonDup = StringUtility.removeDuplicates(a);
        System.out.println(nonDup);
    }


}
