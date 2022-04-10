package week10;

public class CalculateRetirement {
    public static void main(String[] args) {
        yearsTilRet("nihal", 1997);
    }

    public static int age(int yearOfBirth){
        return 2022-yearOfBirth;
    }

    public static void yearsTilRet(String name, int yearOfBirth){
        int yearsTilRet = 65 - age(yearOfBirth);
        System.out.println(name + " retires in " + yearsTilRet + " years.");
    }


}
