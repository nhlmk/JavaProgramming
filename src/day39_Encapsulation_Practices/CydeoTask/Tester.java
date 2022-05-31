package day39_Encapsulation_Practices.CydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+ getName() + " is creating ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + getName() + " is working.");
    }
}
