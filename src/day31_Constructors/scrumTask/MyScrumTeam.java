package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Anna", 11, "QA", 100000);
        Tester tester2 = new Tester("Leila", 12, "SDET", 90000);
        Tester tester3 = new Tester("Alex", 13, "Software Tester", 80000);
        Tester tester4 = new Tester("Pete", 14, "QA", 120000);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Olga", 22, "Java Dev", 12300);
        Developer developer2 = new Developer("Derek", 25, "Java Master", 15000);
        Developer developer3 = new Developer("Daniel", 27, "Java Dev", 18000);
        Developer developer4 = new Developer("Felice", 29, "Java Dev", 20000);

        Developer[] developers = { developer1, developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Niagra", "Husein", "Meredith", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println(" ======================= " );

        for(Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + " : $" + eachTester.salary);
        }


        for(Developer eachDeveloper : scrum.developersList){
            System.out.println(eachDeveloper.name + " : $" + eachDeveloper.salary);
        }

        System.out.println("===========");

        scrum.removeDeveloper(22);
        scrum.removeTester(12);

        System.out.println(scrum);

    }
}
