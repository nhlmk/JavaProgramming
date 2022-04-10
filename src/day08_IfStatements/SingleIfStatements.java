package day08_IfStatements;

public class SingleIfStatements {

    public static void main(String[] args) {

        int num1 = 301;
        boolean evenNumber = num1 % 2 == 0;

        if(evenNumber){

            System.out.println(num1 + " is evenNumber = " + evenNumber);

        }

        boolean oddNumber = num1 % 2 != 0;
        if(oddNumber){
            System.out.println(num1 + "oddNumber = " + oddNumber);

        }

        int num0 = 0;

        boolean equalZero = num0 == 0;
        boolean positive = num0 > 0;
        boolean negative = num1 < 0;

        if(equalZero){

            System.out.println("equalZero = " + equalZero);
        }
        if(positive){

            System.out.println("positive = " + positive);
        }
        if(!positive){
            System.out.println("negative = " + negative);
        }
    }
}
