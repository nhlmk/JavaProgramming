package day33_Statics;

public class Employee {

    public String name;
    public double salary;
    public static boolean isHuman = true;


}

class EmployeeObjects{
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Ruby";
        employee1.salary = 123.000;

        Employee employee2 = new Employee();
        employee2.name = "Ridley";
        employee2.salary = 210.500;

        System.out.println("employee2 = " + employee2.name + employee2.salary);
        System.out.println("employee1 = " + employee1.name + employee1.salary);
        System.out.println("employee1.isHuman = " + employee1.isHuman);
        System.out.println("employee2 = " + employee2.isHuman);


    }
}