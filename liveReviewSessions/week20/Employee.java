package week20;

public class Employee {
    private String first_Name;
    private String last_Name;
    private String job_ID;
    private double salary;
    private int department_ID;

    public Employee() {
    }

    public void setInfo(String first_Name, String last_Name, String job_ID, double salary, int department_ID) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.job_ID = job_ID;
        this.salary = salary;
        this.department_ID = department_ID;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getJob_ID() {
        return job_ID;
    }

    public void setJob_ID(String job_ID) {
        this.job_ID = job_ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment_ID() {
        return department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        this.department_ID = department_ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", job_ID='" + job_ID + '\'' +
                ", salary=" + salary +
                ", department_ID=" + department_ID +
                '}';
    }
}
