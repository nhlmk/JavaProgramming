package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

       Person p1 = new Person("alice", 'f', 13);
        Person p2 = new Person("cecilia", 'f', 25);
       Person p3 = new Person("george", 'm', 40);
       p2.name= "pam";

        System.out.println("p3 = " + p3.name);
        System.out.println("p2 = " + p2.name);
        System.out.println("p1 = " + p1.name);

    }
}
