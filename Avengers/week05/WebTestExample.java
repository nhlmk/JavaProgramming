package week05;

public class WebTestExample {
    public static void main(String[] args) {
        WebDriver driver = new WebDriver("Opera");
        driver.findElement(new ID("Id has been confirmed."));
        driver.findElement(new Name("Name has been confirmed."));
        driver.findElement(new TagName("Tag name has been confirmed. "));

        Locators object = driver.navigateTo("www.google.com");
        Chrome chromeDriver = new Chrome("Chrome");
        ID id_Object = chromeDriver.navigateTo("www.tesla.com");


    }
}
