package day47_Polymorphism;

import day43_Abstraction.personTask.Developer;
import day43_Abstraction.personTask.Employee;
import day43_Abstraction.personTask.Teacher;
import day43_Abstraction.personTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {
    public static void main(String[] args) {

        Employee[] employees = {
               new Teacher("Kelly", -30, 'f', 123000, "Chemist", 23400),
        new Tester("Jim", 35, 'm', 12400, "SDET", -1),
         new Developer("Kevin", 40, 'm', 300, "CodeBuster", 47000)

        };

        List<Employee> scrumMembers = new ArrayList<>();

        for(Employee employee : employees){
            if(employee instanceof Tester||employee instanceof Developer)
                scrumMembers.add(employee);
        }

        System.out.println("--==========================--");
        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for(Employee scrumMember : scrumMembers){
            if(scrumMember instanceof Tester){
                testers.add((Tester) scrumMember);
            }

            if(scrumMember instanceof Developer){
                developers.add((Developer)scrumMember);
            }
        }

        System.out.println("=============================");

        Tester testerWithMaxSalary = testers.get(0);
        Developer developerWithMaxSalary = developers.get(0);

        for(Tester tester : testers){
            if(tester.getSalary()>testerWithMaxSalary.getSalary()){
                testerWithMaxSalary= tester;
            }
        }
        for(Developer developer : developers){
            if(developer.getSalary()>developerWithMaxSalary.getSalary()){
                developerWithMaxSalary=developer;
            }
        }
        System.out.println("developerWithMaxSalary = " + developerWithMaxSalary);
        System.out.println("testerWithMaxSalary = " + testerWithMaxSalary);

    }
}