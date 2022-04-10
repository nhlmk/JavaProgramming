package day14_Str;

import java.util.Scanner;

public class WordsWithoutFirstChar {


    public static void main(String[] args) {

        String a = "banana";
        String b = "apple";

        String c = a.substring(1,a.lastIndexOf("a") + 1) + b.substring(1, b.lastIndexOf("e")+1);
        System.out.println(c);

        System.out.println("========================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");

        String yt = scanner.nextLine();
String gf = yt.substring(yt.length()-2,yt.length());
        System.out.println(gf.equals("ly")? "The word ends with ly so really": "try again");

        System.out.println("==============================================================");

        System.out.println("Enter a word: ");
String ui = scanner.nextLine();

String vc = ui.substring(1, ui.length());
        System.out.println(vc);

        System.out.println("================================================================");
        System.out.println("Enter a word: ");
String qw = scanner.nextLine();
        System.out.println(qw.substring(qw.length()-1));
        System.out.println(qw.substring(0,qw.length()-1));

        System.out.println("Enter another word: ");
        String we = scanner.nextLine();
        System.out.println((we.substring(0)));
        System.out.println(we.substring(1, we.length()));

        String ty = qw.substring(0,qw.length()-1) + "" + we.substring(1, we.length());

        System.out.println((qw.substring(qw.length()-1).equals(we.substring(0)))? ty: "neverming");
    {
            System.out.println(ty);
        }

        System.out.println("================================================================");

        String up = scanner.nextLine();

        char fl = up.charAt(0);

        if(fl >=48 && fl <= 57){
            System.out.println("first char is digit");
        }else if(fl >= 65 && fl <= 90){
            System.out.println("first char is lowecase letter");
        }else if(fl >= 97 && fl <= 122){
            System.out.println("first char is upper case letter");
        }else{
            System.out.println("first char is special char");
        }

        System.out.println("=====================================================================");

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        String newmail = email.substring(email.indexOf('_')+1,email.indexOf('@'))
                + "_" + email.substring(0,email.indexOf('_')) + "@gmail.com";

        System.out.println(newmail);

        System.out.println("=====================================================================");

        System.out.println("enter an email address: ");
        String mnb = scanner.nextLine();

        String zxc = mnb.substring(0, mnb.indexOf('_'));
        String asd = mnb.substring(mnb.indexOf('_')+1,mnb.indexOf('@'));
        String df = mnb.substring(mnb.indexOf('@')+1, mnb.length()+1);

        System.out.println("First name = " + zxc + "\nSec Name = " + asd + "Domain = " + df);






    }
}
