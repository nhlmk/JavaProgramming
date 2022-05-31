package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Daniel", 86);
        students.put("Jake", 90);
        students.put("Maria", 90);
        students.put("Daniel", 95);

        Set<String> keys = students.keySet();

      /*  for(String eachKey : keys){
            students.replace(eachKey, students.get(eachKey)+5);
        }

*/

        System.out.println("students = " + students);
        Map<String, Integer> earlyBirds = new HashMap<>();
        for (String eachKey : students.keySet()){
            Integer eachValue = students.get(eachKey);

            if(eachValue>=90){
                earlyBirds.put(eachKey,eachValue);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);

        System.out.println("===========================");

        //Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println(scores);
        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("=============================");

        int maxScore = Integer.MIN_VALUE;
        int minScore= Integer.MAX_VALUE;
        for (Integer score : students.values()) {
            if(score>maxScore){
                maxScore=score;
            }
            if(score<minScore){
                minScore=score;
            }
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        int count = 0;
       /* for (Integer eachscore : students.values()) {
            if(eachscore>=95){
                count++;
            }
        }


        */

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore>=90){
                count++;
            }
        }

        System.out.println("count = " + count);

        System.out.println("==================");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());

        }


    }
}
