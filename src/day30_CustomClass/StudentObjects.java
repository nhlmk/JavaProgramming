package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {


    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 20, 100908765, 'A' );

        Student student2 = new Student();
        student2.setInfo("Karim", 'M', 18, 100908265, 'C' );

        Student student3 = new Student();
        student3.setInfo("Boules", 'F', 23, 101908765, 'F' );

        Student student4 = new Student();
        student4.setInfo("Talu", 'M', 25, 100298765, 'B' );

        Student student5 = new Student();
        student5.setInfo("Bulut", 'M', 17, 1290308765, 'A' );


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println("student = " + student);
        }

        System.out.println("=================================");

        ArrayList< Student> earlyBirds = new ArrayList<>(); // grade A;
        ArrayList< Student> angryBirds = new ArrayList<>();

       /* for(Student student : students){
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds); */

        System.out.println("==================");

        angryBirds.addAll(Arrays.asList(students));
        angryBirds.removeIf(p -> (p.grade=='A'||p.grade=='a'));
        System.out.println("angryBirds = " + angryBirds);

        earlyBirds.addAll(Arrays.asList(students));
        earlyBirds.removeIf(p -> !(p.grade=='A'||p.grade=='a'));
        System.out.println("earlyBirds = " + earlyBirds);







    }

}
