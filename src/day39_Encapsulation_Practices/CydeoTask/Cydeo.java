package day39_Encapsulation_Practices.CydeoTask;

public class Cydeo {

    public static void main(String[] args) {
        Developer developer = new Developer("NameOfDeveloper", 20, 'f', 10012, "Developer", 34592 );
        Tester tester = new Tester("Name", 25, 'm', 1293, "Tester", 12300);
        Student student = new Student("StudentName", 15, 'm', 12000, "Software");
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("===========");
        developer.setAge(40);
        System.out.println(developer.getAge());
        student.study();
        tester.work();

        System.out.println("=======");
        developer.eat();
        student.sleep();
        tester.eat();
    }
}
