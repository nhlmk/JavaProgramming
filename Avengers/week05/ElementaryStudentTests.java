package week05;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        ElementaryStudent student = new ElementaryStudent();
       try {
           student.setName("Max");
           student.setAge(20);
       }catch (Exception e ){
           e.printStackTrace();
       }
        System.out.println(student);
        System.out.println("some more codes here.");
        System.out.println("some more codes here.");
        System.out.println("some more codes here.");
        System.out.println(" === executions completed === ");




    }
}
