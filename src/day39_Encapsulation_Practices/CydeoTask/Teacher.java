package day39_Encapsulation_Practices.CydeoTask;

public class Teacher extends Employee {


    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+"is working.");
    }
}
