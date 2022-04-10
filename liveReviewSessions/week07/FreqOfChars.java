package week07;

public class FreqOfChars {
    public static void main(String[] args) {
        String str = "aabbccccd";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(c==str.charAt(j)){
                    count++;
                }
            }
            if(res.contains("" + c)){
                continue;
            }

            res +=c;
            res+=count;
        }
        System.out.println(res);
    }
}
