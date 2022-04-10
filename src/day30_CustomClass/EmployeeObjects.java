package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Suzie", 120098, 'F', "Marketer", 98000, true);


        Employee employee2 = new Employee();
        employee2.setInfo("Duran", 121298, 'M', "Recruiter", 48900, true);

        Employee employee3 = new Employee();
        employee3.setInfo("BoJack", 11028, 'M', "Auditor", 29088, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Pam", 19120, 'F', "Security Analyst", 60934, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Jim", 21009, 'M', "Salesperson", 20394, false);


Employee[] array = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<Employee> fullTime = new ArrayList<>();
        
        fullTime.addAll(Arrays.asList(array));
        fullTime.removeIf(p -> !p.isFullTime);
        System.out.println("fullTime = " + fullTime);

        double max = array[0].salary;
        double min = array[0].salary;
        int countFullTime = 0;
        int countPartTime = 0;

        for(Employee employee : array){

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }



            if(employee.salary>max){
                max=employee.salary;
            }

            if(employee.salary<min){
                min=employee.salary;
            }

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);

    }
}
