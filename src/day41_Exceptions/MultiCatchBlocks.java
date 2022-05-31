package day41_Exceptions;

import day39_Encapsulation_Practices.CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee emp = null;

        try {
            System.out.println(emp.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }
        System.out.println("test completed");

        System.out.println("===========");
try {
    System.out.println("java".charAt(-1));
}catch (RuntimeException e){
    e.printStackTrace();
}

    }
}
