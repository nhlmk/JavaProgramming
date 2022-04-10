package day35_OOP_Encapsulation;

public class Person {
    public String name;
    public int age;
    public String language;
    public char gender;
    public static String planet;
    public static boolean hasNose;
    public static boolean isHuman;
    public static int numberOfWings;
    public static int numberOfHead;


    public Person(String name, int age, String language, char gender) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.gender = gender;
    }

    static{
        planet = "MArs";
        isHuman = false;
        hasNose = false;
        numberOfHead = 2;
        numberOfWings = 1;
    }

    public void printPlaneName(){
        System.out.println(name + " lives in " + planet);
    }

    public String eat(String food){
        return name + " eats " + food;
    }

    public String drink (String drink){
        return  name + " drinks " + drink;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                ", printPlanetName=" + planet +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", numberOfHead=" + numberOfHead +
                ", numberOfWings=" + numberOfWings +
                ", eat=" + eat("burger") +
                ", drink=" + drink("coke") +
                '}';
    }
}

class PersonObjects{
    public static void main(String[] args) {
        Person personObj = new Person("Jane", 25, "English", 'f');
        System.out.println("personObj = " + personObj);

    }
}