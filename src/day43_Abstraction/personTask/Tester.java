package day43_Abstraction.personTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hour a day");
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application.");
    }
    public void bugReport(){
        System.out.println(getName()+ " is creating bug reports.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating bugs.");
    }
}
