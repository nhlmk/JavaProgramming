package week09;

public class EtsySearch {
    public static void main(String[] args) {
        System.out.println("--- starting ui automation testing for ETSY website");
   openBrowser("Chrome");
   navigateToUrl("www.etsy.com");
   searchingForItem("Java");
   if(verifyItemIsDisplayed().equalsIgnoreCase("pass")){
       System.out.println("your test case passed");
   }else{
       System.out.println("failed test case scenario.");
   }
    }


    public static void openBrowser(String browser) {
        System.out.println("launching "+ browser + " browser");
    }

    public static void navigateToUrl(String url) {
        System.out.println("navigating to " + url);
    }

    public static void searchingForItem(String item) {
        System.out.println("pass: verify " + item + " exists");
        System.out.println("click on that " + item);
    }

    public static String verifyItemIsDisplayed() {
        String result =  "failed";
        return result;
    }

}
