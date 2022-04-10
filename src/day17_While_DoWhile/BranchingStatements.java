package day17_While_DoWhile;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <  'B'; i++) {

            if(i == 'E'){
                continue;
            }

            System.out.println(i);


        }

        System.out.println("======================");

        for (int zi = 1; zi < 11; zi++) {
            if(zi%2!=0){
continue;            }
            System.out.println(zi);

        }
        System.out.println("===================================");
        for (int j = 1; j < 11; j++) {
            if(j%2==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
