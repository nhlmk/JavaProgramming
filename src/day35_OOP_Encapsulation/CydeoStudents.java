package day35_OOP_Encapsulation;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;

    public CydeoStudents(String name, char gender, int age, int batchNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
    }

    public void attendClass(){
        System.out.println("attending classes");
    }

    public String study(){
        return name + " is studying.";
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", fieldOfStudy='" + fieldOfStudy +
                ", schoolName=" + schoolName +
                ", programmingLanguage=" + programmingLanguage +
                ", study=" + study() +
                '\'' +
                '}';
    }
}

class CydeoObjects {
    public static void main(String[] args) {


        CydeoStudents student1 = new CydeoStudents("Marry", 'f', 40, 123, "CyberSec");
        student1.study();
        student1.attendClass();
        System.out.println("student1 = " + student1);
    }
}