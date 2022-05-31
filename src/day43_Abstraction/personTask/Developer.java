package day43_Abstraction.personTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getName()+ " is developing the application.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping 8 hours a day.");
    }

    public void unitTest(){
        System.out.println(getName()+ " is unit testing. ");
    }
}
