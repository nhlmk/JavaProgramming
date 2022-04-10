package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String schoolName;

    public Student(String name, int age, char gender, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>5&&age<90)
        this.age = age;
    }

    public void setGender(char gender) {
        if(gender=='M'||gender == 'F')
        this.gender = gender;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying. ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
class StudentObjects{
    public static void main(String[] args) {
        Student student1 = new Student("Heidi", 10, 'p', "Cydeo");
        student1.study();
        student1.setAge(15);
        student1.setGender('M');
        System.out.println("student1 = " + student1);
    }
}