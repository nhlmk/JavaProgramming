package day35_OOP_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<0||age>100)
            System.err.println("INV Age " + age);
        System.exit(0);
        this.age = age;
    }

}

class PersonObjects{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Danny");
        p1.setAge(200);

        System.out.println("p1 = " + p1.getName() + p1.getAge());
    }
}