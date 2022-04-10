package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 80, 70, 50, 80, 70, 95, 30, 0, 55));
        ArrayList<Integer > gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !(p>= 90 && p<=100));
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer > gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>= 80 && p<=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer > gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p>= 70 && p<=79));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer > gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>= 60 && p<=69));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer > gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);

        System.out.println("gradeOfF = " + gradeOfF);





    }
}
