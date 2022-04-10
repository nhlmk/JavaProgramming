package week09;

public class CombineStrings {
    public static void main(String[] args) {
        System.out.println(combineStrings("abc", "xwyz"));

    }

    public static String combineStrings(String str1, String str2) {
        String combined = "";
        int biggestSize = str1.length()>str2.length()?str1.length():str2.length();

        for (int i = 0; i < biggestSize; i++){
            if(i<str1.length()){
                combined+=str1.charAt(i);
            }
            if(i<str2.length()){
                combined+=str2.charAt(i);
            }
        }

        return combined;
    }


}
