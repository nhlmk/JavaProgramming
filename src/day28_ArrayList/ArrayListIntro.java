package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
numbers.add(9);
numbers.add(0);
numbers.add(4);
numbers.add(1, 1);
numbers.add(2, 2);
numbers.set(3, 99);

numbers.remove(2);


numbers.lastIndexOf(2);
numbers.indexOf(4);
numbers.size();
        System.out.println("numbers = " + numbers);
        System.out.println("numbers numbers.lastIndexOf(2) = " + numbers.lastIndexOf(2));
        System.out.println("numbers = indexOf(9) " + numbers.indexOf(9));
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers.get(3) = " + numbers.get(3));

        System.out.println(" = =================== =");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers = get(i)" + numbers.get(i));
        }

        System.out.println(" = =================== =");

        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add(2, "C++");
        list.set(1, "JavaScript");

        System.out.println("list = " + list);

        System.out.println("================");
        
        ArrayList<String> employees = new ArrayList<>();
        
        employees.add("Kylie");
        employees.add("Kendall");
        employees.add("Kourtney");
        employees.add("Kim");
        employees.add("Kesha");
        employees.add("Kris");

        System.out.println("emp = " + employees);
        
        employees.remove(0);
        System.out.println("emp = " + employees);
        
        employees.remove(4);
        System.out.println("emp = " + employees);
        
        employees.remove(2);
        System.out.println("employees = " + employees);
        
        employees.remove("Kesha");
        System.out.println("employees = " + employees);


    }
}
