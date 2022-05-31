package week05;

public class UsingThrowKeyword {
    public static void main(String[] args) {

        String userName = "klarus";
        if(userName.charAt(0)=='k')
            throw new RuntimeException("first char is k.");
    }
}
