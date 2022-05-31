package day43_Abstraction.personTask;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();
    public  void eat(){
        System.out.println(name+" is eating baklava.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Kelly", -30, 'f', 123000, "Chemist", 23400);
        Tester tester = new Tester("Jim", 35, 'm', 12400, "SDET", -1);
        Developer developer = new Developer("Kevin", 40, 'm', -2300, "CodeBuster", 47000);
        tester.eat();
        tester.bugReport();
        developer.eat();
        developer.sleep();
        teacher.work();
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
    }
}
