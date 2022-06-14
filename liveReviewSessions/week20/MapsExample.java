package week20;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String, Object> empOne = new LinkedHashMap<>();
        empOne.put("First_Name", "Steven");
        empOne.put("Last_Name", "King");
        empOne.put("Job_ID", "AD_PRES");
        empOne.put("Salary", 2400);
        empOne.put("Department_ID", 90);
        System.out.println("empOne = " + empOne);

        Map<String, Object> empTwo = new LinkedHashMap<>();
        empTwo.put("First_Name", "Neena");
        empTwo.put("Last_Name", "Kumar");
        empTwo.put("Job_ID", "AD_VP");
        empTwo.put("Salary",3000);
        empTwo.put("Department_ID",90);
        System.out.println("empTwo = " + empTwo);

        List<Map<String,Object>> cydeo = new ArrayList<>();
        cydeo.add(empOne);
        cydeo.add(empTwo);
        System.out.println("cydeo = " + cydeo);

        for (Map<String, Object> eachEmp : cydeo) {
            if(eachEmp.get("First_Name").equals("Neena")){
                System.out.println("eachEmp.get(\"Salary\") = " + eachEmp.get("Salary"));
            }

        }


    }
}
