package week16;

public class Swimming extends Exercise{
    @Override
    void perform() {

    }

    @Override
    int getCaloriesCount(int minutes) {
        return minutes*11;
    }
}
