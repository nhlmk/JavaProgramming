package day24_CustomMethds_Return;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
initialsOfAPers("Abc Klm");
domainOfEmail("wetre@tr.com");
String[] emails = { "abc@klm.co", "kop@hjk.com", "qwe@ret.com"};
for (String email: emails){
    domainOfEmail(email);
}
months();
nameOfTheDay();
daysInMonth();

    }

    public static void initialsOfAPers(String answer) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your fullname: ");
        //String answer = scan.nextLine();
        System.out.println(answer.charAt(0)+"" + answer.charAt(answer.indexOf(' ')+1));
    }

    public static void domainOfEmail(String email) {
       // Scanner scan = new Scanner(System.in);
      //  System.out.println("enter your email: ");
       // String email = scan.nextLine();
        System.out.println(email.substring(email.indexOf('@')+1,email.indexOf('.')));
    }

    public static void months() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a month number: 1-12 ");
        int monthNumber = scan.nextInt();

        if(monthNumber==1){
            System.out.println("JAn");
        }else if(monthNumber==2){
            System.out.println("feb");
        }else if(monthNumber==3){
            System.out.println("mar");
        }else if(monthNumber==4){
            System.out.println("apr");
        }else if(monthNumber==5){
            System.out.println("may");
        }else if(monthNumber==6){
            System.out.println("jun");
        }else if(monthNumber==7){
            System.out.println("jul");
        }else if(monthNumber==8){
            System.out.println("aug");
        }else if(monthNumber==9){
            System.out.println("sept");
        }else if(monthNumber==10){
            System.out.println("oct");
        }else if(monthNumber==11){
            System.out.println("nov");
        }else if(monthNumber==12){
            System.out.println("dec");
        }

    }

    public static void nameOfTheDay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of day: ");
        int numOfDay = scan.nextInt();

        if(numOfDay==1){
            System.out.println("mon");
        }else if(numOfDay==2){
            System.out.println("tue");
        }else if(numOfDay==3){
            System.out.println("wed");
        }else if(numOfDay==4){
            System.out.println("thu");
        }else if(numOfDay==5){
            System.out.println("fri");
        }else if(numOfDay==6){
            System.out.println("sat");
        }else if(numOfDay==7){
            System.out.println("sun");
        }else{
            System.out.println("inv day number");
        }
    }

    public static void daysInMonth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of month: ");
        int numberOfMonth = scan.nextInt();

        if(numberOfMonth%2!=0){
            System.out.println(numberOfMonth + " has 31 days. ");
        }else{
            System.out.println(numberOfMonth + " has 30 days. ");
        }
    }


}
