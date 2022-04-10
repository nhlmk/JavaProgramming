package day36_Inheritance.employeeTask;

public class WorkPlace {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Bill", 'F', 19, "Analyst", 12345, 12000, "CompA");
        tester.work();

        Developer developer = new Developer();
        developer.setInfo("name", 'm', 29, "software Guy", 2345, 23400, "tech");
        developer.work();

        Driver driver = new Driver();
        driver.setInfo("abc", 'f', 30, "Boss", 1222, 23050, "Some Comp");
        driver.work();

        Teacher teacher = new Teacher();
        teacher.setInfo("teachersname", 'm', 34, "Assistant", 123123, 43299, "School");
        teacher.work();

        System.out.println("teacher = " + teacher);
        System.out.println("driveradam = " + driver);
        System.out.println("developer = " + developer);
        System.out.println("tester = " + tester);
    }

}
