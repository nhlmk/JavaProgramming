package week16;

abstract class Exercise {

    public void start(){
         System.out.println("warming up and starting the exercise.");
     }
    abstract void perform();
 abstract int getCaloriesCount(int minutes);
}
