package day33_Statics;

public class Students {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Students(String name){
        this.name = name;
    }

    public Students(String name, char gender){
        this(name);
        this.gender = gender;
    }

    public Students(String name, int studentID){
        this(name);
        this.studentID= studentID;
    }

    public Students(String  name, int studentID, char grade){
this(name, studentID);
        this.grade = grade;
    }

    public Students(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Students(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Students(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
