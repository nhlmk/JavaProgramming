package day35_OOP_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(" "))
            return;

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='f'&&gender!='m')
            return;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age<=0||age>150)
           return;

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary<=0)
           return;


        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender="  + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Mindy", 'f', -20, 123000);
        e1.setName("Holly");
        System.out.println("e1 = "  + e1);

        Employee e2 = new Employee("Alan", 'm', 20, 23400);
        e2.setSalary(e1.getSalary()+1000);

        System.out.println("e2 = " + e2);

    }
}