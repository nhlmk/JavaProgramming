package day51_Map;

public class TestEnum {
    public static void main(String[] args) {

       // String browser = "WoodenSpoon";
        Browser browser = Browser.SAFARI;

        switch (browser){
            case EDGE:
                System.out.println("Firefox selected.");
                break;

            case OPERA:
                System.out.println("Opera selected.");
                break;

            case CHROME:
                System.out.println("chrome selected");
                break;

            case FIREFOX:
                System.out.println("Firefox selected.");
                break;

            default:



        }

    }
}
