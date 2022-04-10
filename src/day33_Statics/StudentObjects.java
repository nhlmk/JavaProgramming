package day33_Statics;

import java.sql.Struct;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Students student1 = new Students("Kevin", 5009990, 'B');
        Students students3 = new Students("Alison", 'm', 25, 12092874);
        Students students2 = new Students("Kelly", 'f', 45);

        System.out.println("students2 = " + students2);
        System.out.println("student1 = " + student1);
        System.out.println("students3 = " + students3);

        Students[] students = {student1, students2, students3};
        System.out.println(Arrays.toString(students));
    }
}
