package week15;

public class MultiCatchExamples {

    public static void main(String[] args) {
        String word = "java";


        try {
            System.out.println(word.substring(20));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getClass().getSimpleName());
            System.out.println("reason is " + e.getMessage());
        }catch (Throwable t){
            System.out.println(t.getClass().getSimpleName());
            System.out.println("reason is " + t.getMessage());
        }
    }
}
