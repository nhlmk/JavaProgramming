package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String a = "AABBCCCD";
        String res = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(res.contains(""+ ch)){
                continue;
            }
            res+=ch;
        }
        System.out.println(res);
    }
}
