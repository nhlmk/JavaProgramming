package day34_GarbageCollection;

public class CydeoStudents {
    public String studentName;
    public static String schoolName;

    public CydeoStudents(String studentName){
        this.studentName = studentName;
    }
    static {
        schoolName = "CydeoSchool";
    }

}

class CydeoObjects{
    public static void main(String[] args) {
        CydeoStudents student1 = new CydeoStudents("Jimmy");
        CydeoStudents student2 = new CydeoStudents("Kourtney");

        System.out.println(student2.schoolName);
        System.out.println("student1 = " + student1.studentName + " " + student1.schoolName);
    }
}
