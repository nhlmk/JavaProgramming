package week20;

import org.w3c.dom.ls.LSInput;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExampleWithClassObject {
    public static void main(String[] args) {

        Map<String, Object> cydeo = new LinkedHashMap<>();
        Employee empOne = new Employee();
        empOne.setInfo("Steven", "King", "AD_PRES", 24000, 90);
        cydeo.put("empOne", empOne);

        Employee empTwo = new Employee();
        empTwo.setInfo("Neena", "Dobrev", "AD_VP", 34000, 90);
        cydeo.put("empTwo", empTwo);

        Employee empThree = new Employee();
        empThree.setInfo("Lexi", "Dunnovan", "AD_VP", 29000, 80);
        cydeo.put("empThree", empThree);
        System.out.println("cydeo = " + cydeo);

        for(String eachEmp : cydeo.keySet()){
            Employee temp = (Employee) cydeo.get(eachEmp);
        //    System.out.println("temp = " + temp);
           if(temp.getFirst_Name().equalsIgnoreCase("Neena")){
               if(temp.getSalary()==34000){
                   System.out.println("PASSED " + temp.getFirst_Name() + " " + temp.getSalary());
               }
            }

           if(temp.getFirst_Name().equalsIgnoreCase("lexi")){
               temp.setSalary(1);
               System.out.println("temp.getSalary() +   = " + temp.getSalary() + " " + temp.getFirst_Name());
           }


        }

        for(Map.Entry<String,Object> eachEmpEntry : cydeo.entrySet()){
            Employee temp = (Employee) eachEmpEntry.getValue();
            if(temp.getFirst_Name().equalsIgnoreCase("lexi")){
                temp.setSalary(3);
                System.out.println("temp.getSalary() = " + temp.getSalary());
            }
        }



    }
}
