package day43_Abstraction.personTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping 6 hours");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
