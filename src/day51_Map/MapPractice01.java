package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice01 {

    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Derek", "M" );
        employeeMap.put("Orlando", "M");
        employeeMap.put("Sally", "F");
        employeeMap.put("Erika", "F");

        for (Map.Entry<String, String> entr : employeeMap.entrySet()) {
            if(entr.getValue().equalsIgnoreCase("m")){
                employeeMap.replace(entr.getKey(),"Male");
            }
            if(entr.getValue().equalsIgnoreCase("f")){
                employeeMap.replace(entr.getKey(),"Female");
            }
        }


        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();
            System.out.println("eachValue = " + eachValue);
            System.out.println("eachKey = " + eachKey);
        }

        System.out.println("employeeMap = " + employeeMap);



    }
}